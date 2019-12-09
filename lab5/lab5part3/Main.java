import java.util.HashSet;
import java.util.HashMap;

/**
 * This program creates two {@link WordGroup} objects respectively initialized with a quote by Plato and Roosevelt, and then uses two
 * for loops to print out each word contained in the texts.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Creates and inizializes the two {@link WordGroup} objects, then uses {@link WordGroup}'s {@link #getWordArray()} to make
         * two arrays of Strings cointaining single words, and finally loops over the two arrays printing out each word.
         */
        WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup rooseveltQuote = new WordGroup("When you play play hard when you work dont play at all");

        /* Uses WordGroup class getWordArray() method to make two arrays of Strings, each one cointaining one word from
        the respective WordGroup text. */
        String[] platoWordsArray = platoQuote.getWordArray();
        String[] rooseveltWordsArray = rooseveltQuote.getWordArray();

        // Uses a two for loops to loop over the two arrays and print out each word.
        for (int i = 0; i < platoWordsArray.length; i++) {
            System.out.println(platoWordsArray[i]);
        }

        for (int i = 0; i < rooseveltWordsArray.length; i++) {
            System.out.println(rooseveltWordsArray[i]);
        }

        /**
         * Uses the getWordSet() method using the two WordGroups, then loops over the HashSet returned and prints the words from it.
         */
        platoQuote.getWordSet(rooseveltQuote);

        // Loops over the HashSet returned and prints the words from it.
        for (String words : platoQuote.getWordSet(rooseveltQuote)) {
            System.out.println(words);
        }

        /**
         * Uses {@link #getWordCounts()} and {@link #keySet()} on the two WordGroups to loop over the set of keys (the String
         * part of the mapping), finds the corresponding key and prints print out the word and its count.
         * Uses {@link #getWordSet()} to make complete set of all the words from both WordGroups, then loops over the
         * new HashSet to print a complete list of all words with the word counts from each of the HashMaps.
         */
        for (String word: platoQuote.getWordCounts().keySet()) {
            int value = platoQuote.getWordCounts().get(word);
            System.out.println(word + ": " + value);
        }

        for (String word: rooseveltQuote.getWordCounts().keySet()) {
            int value = rooseveltQuote.getWordCounts().get(word);
            System.out.println(word + ": " + value);
        }

        /* Makes a complete set of all the words from both WordGroups and prints out a complete list of all words with
        the word counts from each of the hashmaps. */
        HashSet<String> finalHashSet = new HashSet();
        finalHashSet = platoQuote.getWordSet(rooseveltQuote);

        // Loops over the set keeping track of how mny times a word is cointained in a quote.
        for (String word : finalHashSet) {
            int value = 0;

            // Checks how many times a word is repeated in each quote using two if statements.
            if (platoQuote.getWordCounts().keySet().contains(word)) {
                value = value + platoQuote.getWordCounts().get(word);
            }

            if (rooseveltQuote.getWordCounts().keySet().contains(word)) {
                value = value + rooseveltQuote.getWordCounts().get(word);
            }

            // Prints out the word and its count.
            System.out.println(word + ": " + value);
        }
    }
}
