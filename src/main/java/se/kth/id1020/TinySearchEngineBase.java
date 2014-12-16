package se.kth.id1020;

import java.util.List;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.Document;
import se.kth.id1020.util.Sentence;

/**
 * Created by Mahmoud Ismail.
 */
public interface TinySearchEngineBase {
    /*
        Prepare to build the index
    */
    public void preInserts();
    /*
        Build the index
     */
    public void insert(Sentence sentence, Attributes attr);
    /*
        Finish up building the index
    */
    public void postInserts();
    /*
        Searching
     */
    public List<Document> search(String query);

    /*
     Convert Prefix into Infix
     */
    public String infix(String query);
}
