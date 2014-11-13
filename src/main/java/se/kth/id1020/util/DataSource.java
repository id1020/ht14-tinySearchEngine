package se.kth.id1020.util;

import com.aliasi.corpus.ObjectHandler;
import com.aliasi.tag.Tagging;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.IOException;
import java.security.CodeSource;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Mahmoud Ismail.
 */
public class DataSource {

    public static interface WordHandler {
        void handle(Word word, Attributes attr);
    }

    private static Document currentDocument;
    private static int occurrence = 0;

    public static void run(final WordHandler handler) throws IOException {
        BrownPosParser parser = new BrownPosParser();
        parser.setHandler(new ObjectHandler<Tagging<String>>() {
            @Override
            public void handle(Tagging<String> st) {
                for (int index = 0; index < st.size(); index++) {
                    handler.handle(new Word(st.token(index).trim(), st.tag(index)), new Attributes(currentDocument, occurrence));
                    occurrence++;
                }
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
                        currentDocument = new Document(docName);
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
                    currentDocument = new Document(docName);
                    occurrence = 0;
                    parser.parse(file);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        final int wordCount[] = new int[1];
        run(new WordHandler() {
            @Override
            public void handle(Word word, Attributes attr) {
                wordCount[0]++;
            }
        });
        System.out.println(wordCount[0]);
    }
}
