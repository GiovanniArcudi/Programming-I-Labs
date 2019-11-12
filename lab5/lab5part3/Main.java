/**
 * This program creates two WordGroups respectively initialized with a quote by Plato and Roosevelt, and then prints out
 * each word cointained in the texts.
 *
 * @author Giovanni Arcudi
 */
import java.util.HashSet;       // Importing HashSet class library
import java.util.HashMap;       // Importing HashMap class library

public class Main {

    /**
     * Performs different tasks for the three parts of the lab.
     */
    public static void main(String[] args) {

        /**
         * (Part I) Creates and inizializes the two WordGroups, then uses WordGroup class getWordArray() method to make
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
         * (Part II) Uses the getWordSet() method using the two WordGroups, then loops over the HashSet returned and prints
         * the words from it.
         */
        platoQuote.getWordSet(rooseveltQuote);

        // Loops over the HashSet returned and prints the words from it.
        for (String words : platoQuote.getWordSet(rooseveltQuote)) {
            System.out.println(words);
        }

        /**
         * (Part III) Uses getWordCounts() and keySet() on the two WordGroups to loop over the set of keys (the String
         * part of the mapping), finds the corresponding key and prints print out the word and its count.
         * Uses the getWordSet() method to make complete set of all the words from both WordGroups, then loops over the
         * new HashSet to print a complete list of all words with the word counts from each of the hashmaps.
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
        for(String word : finalHashSet) {
            int value = 0;

            // Checks how many times a word is repeated in each quote using two if statements.
            if (platoQuote.getWordCounts().keySet().contains(word)) {
                value = value + platoQuote.getWordCounts().get(word);
            }

            if (rooseveltQuote.getWordCounts().keySet().contains(word)) {
                value = value + rooseveltQuote.getWordCounts().get(word);
            }

            //Prints out the word and its count.
            System.out.println(word + ": " + value);
        }
    }
}
