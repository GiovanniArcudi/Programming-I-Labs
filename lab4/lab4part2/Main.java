/**
 * This program: (I) prints a times table and (II) calculates how many successive integers to add to make a total over 500.
 * (I) The user is asked to enter a number and the program outputs a multiplication table up to 20 times that number.
 * (II) After having summed consecutive integers starting from 1 until the sum of those integers is greater than 500,
 * the program prints out how many iterations were required to do this.
 *
 * @author Giovanni Arcudi
 */
public class Main {

    /**
     * Prints a times table and calculates how many successive integers to add to make a total over 500.
     */
    public static void main(String[] args) {
        Toolbox myToolbox = new Toolbox();      // Creates a new toolbox.

        int userNumber = myToolbox.readIntegerFromCmd();        // The user is asked to enter a number.
        int sum = 0;
        int integerToSum = 1;

        /**
         * Uses a traditional for loop to output a multiplication table up to 20 times the number specified by the user.
         */
        for(int i=1; i<21; i++) {
            System.out.println(userNumber * i);
        }

        /**
         * Uses a while loop to sum consecutive integers starting from 1 (eg. 1+2+3...), until the sum of those integers
         * is greater than 500. If the sum is grater than 500, then the number of iterations required to reach that number
         * is equal to the last number added - 1.
         */
        while(sum <= 500) {
            sum = sum + integerToSum;
            integerToSum++;

            // When the sum is grater than 500 it prints out the number of iterations required to reach that number.
            if(sum > 500) {
                System.out.println(integerToSum - 1);
            }
        }

        /**
         * Creates a UserGroup object and calls the methods addSampleData() and printUsernames().
         */
        UserGroup myUserGroup = new UserGroup();
        myUserGroup.addSampleData();
        myUserGroup.printUsernames();
    }
}