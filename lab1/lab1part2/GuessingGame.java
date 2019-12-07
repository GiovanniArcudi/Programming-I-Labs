/**
 * After having randomly generated a number from 1 to 10, the computer asks the user to enter a number and tells
 * whether it is too high, too low or exactly the same.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class GuessingGame {
    
    public static void main(String[] args) {
        Integer numberToGuess;
        Integer guessedNumber;

        //Creates a new Toolbox.
        Toolbox myToolbox = new Toolbox();

        System.out.println("Welcome to Guessing Game");

        numberToGuess = myToolbox.getRandomInteger(10);
        guessedNumber = myToolbox.readIntegerFromCmd();

        /* Checks whether the guessed number is equal to the number to guess and prints out if the input number is
        right, too low or too high. */
        if (numberToGuess.equals(guessedNumber)) {
            System.out.println("right");
        } else {
            if (numberToGuess > guessedNumber) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        }
    }
}
