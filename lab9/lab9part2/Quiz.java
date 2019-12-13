import java.util.ArrayList;

/**
 * This class defines a Quiz.
 *
 * @author Giovanni Arcudi
 */
public class Quiz {
    private String fileName;                                   // The name of the file containing questions and answers.
    private ArrayList<FlashCard> flashCards;                   // The array list of all flashcards.
    private FlashCardReader reader;                            // The quiz's flashcards reader.
    private Toolbox toolbox = new Toolbox();                   // The toolbox.


    /**
     * This is the Quiz class constructor.
     * It iniitializes the variables and runs the Quiz.
     *
     * @param fileName          the name of the file containing questions and answers for the quiz
     */
    public Quiz(String fileName) {
        this.fileName = fileName;
        reader = new FlashCardReader(this.fileName);
        flashCards = reader.getFlashCards();
        play();
    }

    /**
     * Runs the Quiz.
     * Prints out every flashcard's question and lets the user answer. The user will be told if he/she is right or not.
     */
    public void play() {

        // Iterating over each flashcard in the array list, displays the question and reads the input from the user.
        for (FlashCard flashCard : flashCards) {
            System.out.println(flashCard.getQuestion());
            String userAnswer = toolbox.readStringFromCmd();

            // Checks the user's input against the answer and prints out if user's answer was right or wrong.
            if (userAnswer.equals(flashCard.getAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                System.out.println("The right answer was: " + flashCard.getAnswer() + ".");
            }
        }
    }

    /**
     * Quiz's class main method.
     * It creates a new Quiz and runs it.
     */
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz("Questions.txt");
    }
}
