package se.kth.id1020.util;

/**
 * Created by Mahmoud Ismail.
 */
public class Word {

    private final WordType wordType;
    private final String word;

    public Word(String word, String wordTag){
        this.wordType = WordType.getType(wordTag);
        this.word = word;
    }

    public WordType getWordType() {
        return wordType;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;

        Word word1 = (Word) o;

        if (!word.equals(word1.word)) return false;
        if (wordType != word1.wordType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wordType.hashCode();
        result = 31 * result + word.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Word{" +
                "type=" + wordType +
                ", value='" + word + '\'' +
                '}';
    }
}
