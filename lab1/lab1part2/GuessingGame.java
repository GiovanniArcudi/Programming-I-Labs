/**
 * After having randomly generated a number from 1 to 10, the computer asks the user to enter a number and tells
 * whether it is too high, too low or exactly the same.
 *
 * @author Giovanni Arcudi
 */
public class GuessingGame {

    public static void main(String[] args) {
        Integer numberToGuess;
        Integer guessedNumber;

        //Creating a new toolbox.
        Toolbox myToolbox = new Toolbox();

        System.out.println("Welcome to Guessing Game");

        numberToGuess = myToolbox.getRandomInteger(10);
        guessedNumber = myToolbox.readIntegerFromCmd();

        // Checking whether the guessed number is equal to the number to guess.
        if (numberToGuess.equals(guessedNumber)) {
            System.out.println("right");
        } else {
            // If the guessed number is not equal to the number to guess then we have to find out if it is greater or smaller.
            if (numberToGuess > guessedNumber) {
                System.out.println("too low");
            } else {
                // If the guessed number is not equal to and not smaller than the number to guess, then it must be greater.
                System.out.println("too high");
            }
        }
    }
}
