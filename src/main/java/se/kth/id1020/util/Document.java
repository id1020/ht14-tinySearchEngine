/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.id1020.util;

/**
 *
 * @author lkroll
 */
public class Document implements Comparable<Document> {

    public final String name;
    public final int popularity;

    public Document(String name) {
        this.name = name;
        this.popularity = Math.abs(name.hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Document) {
            Document that = (Document) o;
            return this.compareTo(that) == 0;
        }
        return false;
    }

    @Override
    public int compareTo(Document that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Document{" + name + ", pop=" + popularity + "}";
    }
}
