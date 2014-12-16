package se.kth.id1020.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud Ismail.
 */
public class Sentence {
    private final List<Word> words;

    Sentence() {
        this.words = new ArrayList<Word>();
    }

    void addWord(Word word){
        this.words.add(word);
    }

    public List<Word> getWords(){
        return words;
    }
}
