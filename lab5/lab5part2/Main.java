/**
 * This program creates two WordGroups respectively initialized with a quote by Plato and Roosevelt, and then prints out
 * each word cointained in the texts.
 *
 * @author Giovanni Arcudi
 */
public class Main {

    /**
     * Performs different tasks for the two parts of the lab.
     */
    public static void main(String[] args) {

        /**
         * (Part I) Creates and inizializes the two WordGroups, then uses WordGroup class getWordArray() method to make
         * two arrays of Strings cointaining single words, and finally loops over the two arrays printing out each word.
         */
        WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup rooseveltQuote = new WordGroup( "When you play play hard when you work dont play at all");

        /* Uses WordGroup class getWordArray() method to make two arrays of Strings, each one cointaining one word from
        the respective WordGroup text. */
        String[] platoWordsArray = platoQuote.getWordArray();
        String[] rooseveltWordsArray = rooseveltQuote.getWordArray();

        // Uses a two for loops to loop over the two arrays and print out each word.
        for(int i = 0; i < platoWordsArray.length; i++) {
            System.out.println(platoWordsArray[i]);
        }

        for(int i = 0; i < rooseveltWordsArray.length; i++) {
            System.out.println(rooseveltWordsArray[i]);
        }

        /**
         * (Part II) Uses the getWordSet() method using the two WordGroups, then loops over the HashSet returned and
         * prints the words from it.
         */
        platoQuote.getWordSet(rooseveltQuote);

        // Loops over the HashSet returned and prints the words from it.
        for(String words : platoQuote.getWordSet(rooseveltQuote)) {
            System.out.println(words);
        }
    }
}