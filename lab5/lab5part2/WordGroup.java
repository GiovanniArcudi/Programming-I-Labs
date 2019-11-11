/**
 * This program defines a WordGroup.
 * Every WordGroup object has an instance variable of type String called "words"and some methods to operate with it.
 *
 * @author Giovanni Arcudi
 */
import java.util.HashSet;       // Importing HashSet class library

public class WordGroup {
    private String words;

    /**
     * This is the WordGroup class constructor.
     * It takes a String as parameter, then convertes it into lower case using toLowerCase() and stores in the "words"
     * variable.
     */
    public WordGroup(String input) {
        words = input.toLowerCase();
    }

    /**
     * When the method getWordArray() is called, it returns an array of strings called "separatedWords" of which each
     * string cointains one single word from the variable "words".
     * The String class split() method is used to separate words on " ".
     */
    public String[] getWordArray() {
        String[] separatedWords = words.split(" ");
        return separatedWords;
    }

    /**
     * When the method getWordSet() is called, it creates a HashSet<String>, then uses two for loops to put all the words
     * from this (the object from which the method is called) and the parameter WordGroup into the HashSet, and finally
     * returns the HashSet<String>.
     */
    public HashSet<String> getWordSet(WordGroup wordGroup) {
        HashSet<String> wordsHashSet = new HashSet();

        /* Uses two for loops to put all the words from this (remember, you will be executing this method inside a
        WordGroup object) and the parameter WordGroup into the HashSet. */
        for(int i = 0; i < this.getWordArray().length; i++) {
            String[] wordsArray = this.getWordArray();
            wordsHashSet.add(wordsArray[i]);
        }

        for(int i = 0; i < wordGroup.getWordArray().length; i++) {
            String[] wordsArray = wordGroup.getWordArray();
            wordsHashSet.add(wordsArray[i]);
        }

        return wordsHashSet;
    }
}