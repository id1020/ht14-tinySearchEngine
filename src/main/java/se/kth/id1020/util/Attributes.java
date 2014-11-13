package se.kth.id1020.util;

/**
 * Created by Mahmoud Ismail.
 */
public class Attributes {
    public final Document document;
    public final int occurrence;

    public Attributes(Document document, int occurrence){
        this.occurrence = occurrence;
        this.document = document;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "document='" + document + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
