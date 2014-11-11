package se.kth.id1020.util;

import com.aliasi.corpus.ObjectHandler;
import com.aliasi.tag.Tagging;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mahmoud Ismail.
 */
public class DataSource {

    public static interface WordHandler {
        void handle(Word word, Attributes attr);
    }

    private static String currentDocument;

    public static void run(final WordHandler handler) throws IOException {
        File brownDir = new File(DataSource.class.getResource("/brown").getPath());
        BrownPosParser parser = new BrownPosParser();
        parser.setHandler(new ObjectHandler<Tagging<String>>() {
            @Override
            public void handle(Tagging<String> st) {
                for(int index =0; index< st.size(); index++){
                    handler.handle(new Word(st.token(index), st.tag(index)), new Attributes(currentDocument, index));
                }
            }
        });
        for(File file : brownDir.listFiles()){
            if(file.getName().equals("CONTENTS") || file.getName().equals("cats.txt") || file.getName().equals("README"))
                continue;

          currentDocument = file.getName();
          parser.parse(file);
        }
    }

    public static void main(String[] args) throws IOException{
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
