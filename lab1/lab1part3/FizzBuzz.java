/**
 * The computer counts incrementally, replacing any number divisible by three with the word "Fizz", and any number
 * divisible by five with the word "Buzz".
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class FizzBuzz {
    public static void main(String[] args) {

        /* Assigns "i" the value 1, completes the instructions inside the curly brackets, and then increses the value
        of "i". It repeats this for 60 times. */
        for (Integer i = new Integer(1); i < 61; i++) {

            // Checks if "i" is divisible by 3 and, if true, prints "Fizz".
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            
            // Checks if "i" is divisible by 5 and, if true, prints "Buzz".
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

            // Checks if "i" is not divisible by 3 and 5, if so, prints out the value of "i".
            if(i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
