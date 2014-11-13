package se.kth.id1020.util;

/**
 * Created by Mahmoud Ismail.
 */
public class Word {

    public final PartOfSpeech pos;
    public final String word;

    public Word(String word, String wordTag) {
        this.pos = PartOfSpeech.getType(wordTag);
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Word)) {
            return false;
        }

        Word word1 = (Word) o;

        if (!word.equals(word1.word)) {
            return false;
        }
        return pos == word1.pos;
    }

    @Override
    public int hashCode() {
        int result = pos.hashCode();
        result = 31 * result + word.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Word{\"");
        sb.append(word);
        sb.append("\" // ");
        sb.append(pos.name());
        sb.append("}");
        return sb.toString();
    }
}
