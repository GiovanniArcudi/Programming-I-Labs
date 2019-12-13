import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * This class defines a Quiz.
 *
 * @author Giovanni Arcudi
 */
public class Quiz {

    private String fileName;                              // The name of the file containing questions and answers.
    private FlashCardReader reader;                       // The quiz's flashcards reader.
    private ArrayList<FlashCard> flashCards;              // The array list of all flashcards.
    private Toolbox myToolbox;                            // The toolbox.
    private PrintStream writer;                           // The output print stream.
    private int userScore;                                // The user's score.
    private int numberQuestions;                          // Total number of questions asked to the user.

    /**
     * Quiz's constructor.
     * It iniitializes the variables and runs the Quiz.
     *
     * @param fileName      the name of the file containing questions and answers for the quiz
     */
    public Quiz(String fileName) {
        this.fileName = fileName;
        reader = new FlashCardReader(fileName);
        flashCards = reader.getFlashCards();
        numberQuestions = flashCards.size();
        myToolbox = new Toolbox();
        play();
    }

    /**
     * Runs the Quiz.
     * Prints out every flashcard's question and lets the user answer. The user will be told if he/she is right or not.
     */
    public void play() {
        String userAnswer = null;                    // Stores the answer of the user.
        boolean acceptableAnswer = false;            // True if the answer is "Y" or "N", false otherwise.

        // Asks the user if they want to save their result, until they provide a valid answer.
        while (!acceptableAnswer) {
            System.out.println("Would you like to save your results?");
            userAnswer = myToolbox.readStringFromCmd();
            if (userAnswer.equalsIgnoreCase("Y") || userAnswer.equalsIgnoreCase("N")) {
                acceptableAnswer = true;
            }
        }

        /* If the user wants to save their result, sets the output file to be "save.txt" and, eventually catches the
        exception. Otherwise, it just let the user answer every flashcard question without saving answers and score.*/
        if (userAnswer.equalsIgnoreCase("Y")) {
            try {
                writer = new PrintStream(new FileOutputStream("save.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.err.println("Sorry, something went wrong.");
            }

            // Lets the user answer every flashcard's question and saves every answer plus the score recap in "save.txt".
            for (FlashCard flashCard : flashCards) {
                save(playTool(flashCard));
            }
            save(finalLine());
        } else if (userAnswer.equalsIgnoreCase("N")) {
            for (FlashCard flashCard : flashCards) {
                playTool(flashCard);
            }
        }
    }

    /**
     * Gets the percentage of questions the user got right.
     *
     * @return a double containing the percentage of right answers over the total of the asked questions
     */
    public double getScorePercentage() {
        return ((double) userScore / numberQuestions) * 100;
    }

    /**
     * Returns the user score, the number of questions and the percentage of right answers.
     *
     * @return a string containing the user score, number of question and percentage of right answers
     */
    public String finalLine() {
        String finalLine = userScore + "," + numberQuestions + "," + getScorePercentage();
        return finalLine;
    }

    /**
     * Prints out a flashcard question and lets the user answer. If right, the user's score will be incremented by 1.
     *
     * @param flashCard     the flashcard to use
     * @return a string containing the question, the user's answer and whether or not the answer is right
     */
    public String playTool(FlashCard flashCard) {
        String question = flashCard.getQuestion();
        System.out.println(question);
        String answer = myToolbox.readStringFromCmd();

        /* If the user's answer is right it increments the score by 1, prints out "correct", and saves question, answer
        and correctness in a new line of save.txt. If the user is wrong it prints out "wrong", gives the correct answer
        and finally saves everything in a new line of save.txt.*/
        if (answer.equalsIgnoreCase(flashCard.getAnswer())) {
            userScore++;
            System.out.println("Correct!");
            String savedLine = question + "," + answer + "," + "right";
            return savedLine;
        } else {
            System.out.println("Wrong!");
            System.out.println("The right answer was: " + flashCard.getAnswer() + ".\n");
            String savedLine = question + "," + answer + "," + "wrong";
            return savedLine;
        }
    }

    /**
     * Saves a line into the writer file (save.txt).
     *
     * @param line    the line to save
     */
    public void save(String line) {
        writer.println(line);
    }

    /**
     * Quiz class main method. Creates a new Quiz and runs it.
     */
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz("Questions.txt");
    }
}
