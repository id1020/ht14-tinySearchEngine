package se.kth.id1020;

import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.Word;

/**
 * Created by Mahmoud Ismail.
 */
public interface TinySearchEngineBase {
    /*
        Build the index
     */
    void insert(Word word, Attributes attr);

    /*
        Searching
     */
    String[] search(String query);
}
