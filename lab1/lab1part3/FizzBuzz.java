/**
 * The computer counts incrementally, replacing any number divisible by three with the word "Fizz", and any number
 * divisible by five with the word "Buzz".
 *
 * @author Giovanni Arcudi
 */

public class FizzBuzz {     //Class wrapper.

    public static void main(String[] args) {        //Main method wrapper.

        /* Assign "i" the value 1, completes the instructions inside the curly brackets, and then increses the value
        of "i". It repeats this for 60 times. */
        for(Integer i = new Integer(1); i < 61; i++){

            if(i % 3 == 0){     //Checking if "i" is divisible by 3.
                System.out.print("Fizz");       //If true, prints "Fizz".
            }
            
            if(i % 5 == 0){     //Checking if "i" is divisible by 5.
                System.out.print("Buzz");        //If true, prints "Buzz".
            }

            if(i % 3 != 0 && i % 5 != 0){       //Checking if "i" is not divisible by 3 and 5.
                System.out.print(i);        //If "i" is not divisible by 3 and not divisible by 5, then it prints the value of "i".
            }

            System.out.println();       //Creates a new line where to write about the next number.
        }
    }
}