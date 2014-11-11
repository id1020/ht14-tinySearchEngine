package se.kth.id1020;

import edu.princeton.cs.introcs.In;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.DataSource;
import se.kth.id1020.util.Word;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mahmoud Ismail.
 */
public class Driver {

    static void run(TinySearchEngineBase se) throws IOException{
        buildTheIndex(se);
        testTheEngine(se);
    }

    static void testTheEngine(TinySearchEngineBase se) throws IOException{
        In input = new In(new Scanner(System.in));
        while (true){
            System.out.print("Search: ");
            String query  = input.readLine();
            if(query.equals("exit")){
                break;
            }
            String[] res = se.search(query);
            for(String r : res){
                System.out.println(r);
            }
        }
    }


    static void buildTheIndex(final TinySearchEngineBase se) throws IOException {
        DataSource.run(new DataSource.WordHandler() {
            @Override
            public void handle(Word word, Attributes attr) {
                se.insert(word, attr);
            }
        });
    }

}
