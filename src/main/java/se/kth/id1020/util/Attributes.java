package se.kth.id1020.util;

/**
 * Created by Mahmoud Ismail.
 */
public class Attributes {
    private final String docuemnt;
    private final int occurence;
    private final int popularity;

    public Attributes(String docuemnt, int occurence){
        this.occurence = occurence;
        this.docuemnt =docuemnt;
        this.popularity = Math.abs(docuemnt.hashCode());
    }

    public int getOccurence() {
        return occurence;
    }

    public String getDocuemnt() {
        return docuemnt;
    }

    public int getPopularity() {
        return popularity;
    }

}
