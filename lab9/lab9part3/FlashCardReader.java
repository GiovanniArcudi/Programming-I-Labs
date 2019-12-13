import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This class defines a Flash Card Reader.
 *
 * @author Giovanni Arcudi
 */
public class FlashCardReader {
    private BufferedReader reader;                      // The reader of the Flash Card Reader Class.
    private String fileName;                            // The name of the file to read.
    private ArrayList<FlashCard> flashCards;            // The array list of all the flashcards.

    /**
     * Flash Card Reader's constructor.
     *
     * @param fileName      the name of the file to read
     */
    public FlashCardReader(String fileName) {

        // Initializes the buffered reader and, eventually, catches the FleNotFoundException thrown by FileReader.
        try {
            this.fileName = fileName;
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File to read not found!");
        }
    }

    /**
     * Returns the next line of the contents of the file.
     *
     * @return the next line of the contents of the file
     */
    public String getLine() {
        String line = null;                 // Stores the just read line.

        // Reads the next line and returns it. If an I/O error occurs it catches the IOException.
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Unable to read next line!");
        }
        return line;
    }

    /**
     * Finds out whether the file is ready to be read.
     *
     * @return true if it is ready to be used, false otherwise
     */
    public boolean fileIsReady() {
        boolean isReady;                    // Stores the boolean value to return.

        /* Checks if the if the next read() is guaranteed not to block for input and, eventually, catches the IOExeption
        thrown by reader.ready(). */
        try {
            if (reader != null) {
                isReady = reader.ready();
            } else {
                isReady = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            isReady = false;
            System.err.println("I/O Error!");
        }
        return isReady;
    }

    /**
     * Flashcards array list's accessor method.
     *
     * @return the array list containing all flashcards
     */
    public ArrayList<FlashCard> getFlashCards() {
        flashCards = new ArrayList<FlashCard>();

        /* Reads each line of the input file and, if != null, splits it in question and answer and stores it as a
        flashcard in the flashcards array list. If readLine() throws an IOException it catches it. */
        try {
            String line = reader.readLine();
            while (line != null) {
                String[] completeFlashCard = line.split(":");
                String question = completeFlashCard[0];
                String answer = completeFlashCard[1];
                FlashCard flashCard = new FlashCard(question, answer);
                flashCards.add(flashCard);
                line = reader.readLine();
            }
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return flashCards;
    }
}
