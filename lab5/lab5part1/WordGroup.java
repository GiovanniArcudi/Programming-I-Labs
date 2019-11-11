/**
 * This program defines a WordGroup.
 * Every WordGroup object has an instance variable of type String called "words" and some methods to operate with it.
 *
 * @author Giovanni Arcudi
 */
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
}