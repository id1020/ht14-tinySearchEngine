package se.kth.id1020.util;

/**
 * Created by Mahmoud Ismail.
 */
public class Attributes {
    private final String document;
    private final int occurrence;
    private final int popularity;

    public Attributes(String document, int occurrence){
        this.occurrence = occurrence;
        this.document = document;
        this.popularity = Math.abs(document.hashCode());
    }

    public int getOccurrence() {
        return occurrence;
    }

    public String getDocument() {
        return document;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "document='" + document + '\'' +
                ", occurrence=" + occurrence +
                ", popularity=" + popularity +
                '}';
    }
}
