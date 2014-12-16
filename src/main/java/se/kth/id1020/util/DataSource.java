package se.kth.id1020.util;

import com.aliasi.corpus.ObjectHandler;
import com.aliasi.tag.Tagging;
import com.google.common.primitives.Ints;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Mahmoud Ismail.
 */
public class DataSource {

    private final static MessageDigest md;
    
    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static int nameToPop(String docName) {
        md.reset();
        byte[] hash = md.digest(docName.getBytes(Charset.forName("UTF-8")));
        int hashi = Ints.fromByteArray(hash);
        return hashi < 0 ? -hashi : hashi; 
    }

    public static interface SentenceHandler {
        void handle(Sentence sentence, Attributes attr);
    }

    private static Document currentDocument;
    private static int occurrence = 0;

    public static void run(final SentenceHandler handler) throws IOException {
        BrownPosParser parser = new BrownPosParser();
        parser.setHandler(new ObjectHandler<Tagging<String>>() {
            @Override
            public void handle(Tagging<String> st) {
                Sentence sentence = new Sentence();
                for (int index = 0; index < st.size(); index++) {
                    sentence.addWord(new Word(st.token(index).trim(), st.tag(index)));
                }
                handler.handle(sentence, new Attributes(currentDocument, occurrence));
                occurrence++;
            }
        });

        CodeSource src = DataSource.class.getProtectionDomain().getCodeSource();
        if (src != null) {
            if (src.getLocation().getPath().endsWith(".jar")) {
                ZipInputStream jar = new ZipInputStream(src.getLocation().openStream());
                ZipEntry jarEntry = null;
                while ((jarEntry = jar.getNextEntry()) != null) {
                    String entryName = jarEntry.getName();
                    if (entryName.startsWith("brown") && !entryName.equals("brown/") &&
                            !entryName.equals("brown/CONTENTS") && !entryName.equals("brown/cats.txt")
                            && !entryName.equals("brown/README")) {
                        InputSource inputSource = new InputSource(DataSource.class.getResourceAsStream("/" + entryName));
                        String docName = entryName.split("/")[1];
                        currentDocument = new Document(docName, nameToPop(docName));
                        occurrence = 0;
                        parser.parse(inputSource);
                    }
                }
            } else {
                File brownDir = new File(DataSource.class.getResource("/brown").getPath());
                for (File file : brownDir.listFiles()) {
                    if (file.getName().equals("CONTENTS") || file.getName().equals("cats.txt") || file.getName().equals("README"))
                        continue;

                    String docName = file.getName();
                    currentDocument = new Document(docName, nameToPop(docName));
                    occurrence = 0;
                    parser.parse(file);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        final Map<Document, Integer> d = new HashMap<Document, Integer>();
        run(new SentenceHandler() {
            @Override
            public void handle(Sentence sentence, Attributes attr) {
                Integer v = d.get(attr.document);
                v = v == null ? 0 : v + 1;
                d.put(attr.document, v);
            }
        });
        List<Integer> val = new ArrayList<Integer>(d.values());
        Collections.sort(val);
        System.out.println(val);
    }
}
