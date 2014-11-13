package se.kth.id1020;

import edu.princeton.cs.introcs.In;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.DataSource;
import se.kth.id1020.util.Word;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import se.kth.id1020.util.Document;

/**
 * Created by Mahmoud Ismail.
 */
public class Driver {

    public static void run(TinySearchEngineBase se) throws Exception {
        buildTheIndex(se);
        testTheEngine(se);
    }

    static void testTheEngine(TinySearchEngineBase se) throws IOException {
        In input = new In(new Scanner(System.in));
        while (true) {
            System.out.print("Search: ");
            String query = input.readLine();
            if (query.equals("exit")) {
                break;
            }
            long t1 = System.nanoTime();
            List<Document> res = se.search(query);
            long e = System.nanoTime() - t1;
            if (res == null) {
                res = new ArrayList<Document>();
            }
            System.out.println("got " + res.size() + " results in " + convertnanoTimeToString(e));
            for (Document r : res) {
                System.out.println(r);
            }
        }
    }

    static void buildTheIndex(final TinySearchEngineBase se) throws Exception {
        long t1 = System.nanoTime();
        DataSource.run(new DataSource.WordHandler() {
            @Override
            public void handle(Word word, Attributes attr) {
                se.insert(word, attr);
            }
        });
        long e = System.nanoTime() - t1;
        System.out.println("Building the index done in " + convertnanoTimeToString(e));
    }


    static String convertnanoTimeToString(long elapsed) {
        String time = "";
        elapsed /= 1000;
        if(elapsed < 1000){
            time = elapsed + " microseconds";
            return time;
        }
        elapsed /= 1000;
        if(elapsed < 1000){
            time = elapsed + " miliseconds";
            return time;
        }
        elapsed /= 1000;
        if(elapsed < 1000){
            time = elapsed + " seconds";
            return time;
        }
        return time;
    }
}
