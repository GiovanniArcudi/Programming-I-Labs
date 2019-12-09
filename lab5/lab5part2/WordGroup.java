import java.util.HashSet;

/**
 * Every {@link WordGroup} object has an instance variable of type String called "words" and some methods to operate with it.
 *
 * @author Giovanni Arcudi
 * @version 2.0
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

    /**
     * Creates a HashSet<String>, then uses two for loops to put all the words from this (the object from which the method is called)
     * and the parameter WordGroup into the HashSet, and finally returns the HashSet<String>.
     *
     * @return an HashSet containing all the the words of this WordGroup and the WordGroup passed as parameter
     */
    public HashSet<String> getWordSet(WordGroup wordGroup) {
        HashSet<String> wordsHashSet = new HashSet();

        /* Uses two for loops to put all the words from this (remember, you will be executing this method inside a
        WordGroup object) and the parameter WordGroup into the HashSet. */
        for (int i = 0; i < this.getWordArray().length; i++) {
            String[] wordsArray = this.getWordArray();
            wordsHashSet.add(wordsArray[i]);
        }

        for (int i = 0; i < wordGroup.getWordArray().length; i++) {
            String[] wordsArray = wordGroup.getWordArray();
            wordsHashSet.add(wordsArray[i]);
        }

        return wordsHashSet;
    }
}
