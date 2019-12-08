/**
 * This program prints a times table and calculates how many successive integers to add to make a total over 500.<ol>
 * <li>The user is asked to enter a number and the program outputs a multiplication table up to 20 times that number.</li>
 * <li>After having summed consecutive integers starting from 1 until the sum of those integers is greater than 500,
 * the program prints out how many iterations were required to do this.</li></ol>
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public class Main {

    /**
     * Prints a times table and calculates how many successive integers to add to make a total over 500.
     */
    public static void main(String[] args) {
        Toolbox myToolbox = new Toolbox();      // Creates a new toolbox.

        // The user is asked to enter a number.
        int userNumber = myToolbox.readIntegerFromCmd();
        int sum = 0;
        int integerToSum = 1;

        /**
         * Uses a traditional for loop to output a multiplication table up to 20 times the {@code userNumber}.
         */
        for(int i=1; i<21; i++) {
            System.out.println(userNumber * i);
        }

        /**
         * Uses a while loop to sum consecutive integers starting from 1 (eg. 1+2+3...), until the sum of those integers
         * is greater than 500. If the {@code sum} is grater than 500, then the number of iterations required to reach that number
         * is equal to the last number added - 1.
         */
        while(sum <= 500) {
            sum = sum + integerToSum;
            integerToSum++;

            // When the {@code sum} is grater than 500 it prints out the number of iterations required to reach that number.            
            if(sum > 500) {
                System.out.println(integerToSum - 1);
            }
        }

        /**
         * Creates a {@link UserGroup} object and calls the {@link #addSampleData()} and {@link #printUsernames()}.
         */
        UserGroup myUserGroup = new UserGroup();
        myUserGroup.addSampleData();
        myUserGroup.printUsernames();
    }
}
