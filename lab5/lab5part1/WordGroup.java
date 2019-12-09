/**
 * Every {@link WordGroup} object has an instance variable of type String called "words" and some methods to operate with it.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class WordGroup {
    private String words;

    /**
     * This is the {@link WordGroup} class constructor.
     * It takes a String as parameter, then convertes it into lower case using {@link #toLowerCase()} and stores it in the {@code words}.
     */
    public WordGroup(String input) {
        words = input.toLowerCase();
    }

    /**
     * Returns the {@code separatedWords} Array of Strings, of which each string cointains one single word from {@code words}.
     * The String class {@link #split()} method is used to separate words on " ".
     *
     * @return an array containing each word from words, stored singularly
     */
    public String[] getWordArray() {
        String[] separatedWords = words.split(" ");
        return separatedWords;
    }
}
