/**
 * This program creates two {@link WordGroup} objects respectively initialized with a quote by Plato and Roosevelt, and then uses two
 * for loops to print out each word contained in the textes.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Main {

    /**
     * Creates and inizializes the two {@link WordGroup} objects, then uses {@link WordGroup}'s {@link #getWordArray()} method to make
     * two arrays of Strings cointaining single words, and finally loops over the two arrays printing out each word.
     */
    public static void main(String[] args) {
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
    }
}
