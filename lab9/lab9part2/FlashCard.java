/**
 * This class defines a Flash Card.
 *
 * @author Giovanni Arcudi
 */
public class FlashCard {
    private String question;            // The question of the flashcard.
    private String answer;              // The answer to the question.

    /**
     * This is the Flashcard class constructor.
     *
     * @param question      the question of the flashcard
     * @param answer        the answer to the question
     */
    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    /**
     * Flashcard's question accessor method.
     *
     * @return the question of the flashcard
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Flashcard's answer accessor method.
     *
     * @return the answer to flashcard's question
     */
    public String getAnswer() {
        return answer;
    }
}
