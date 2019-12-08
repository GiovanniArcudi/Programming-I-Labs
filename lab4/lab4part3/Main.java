/**
 * This program prints a times table and calculates how many successive integers to add to make a total over 500. <ol>
 * <li>The user is asked to enter a number and the program outputs a multiplication table up to 20 times that number.</li>
 * <li>After having summed consecutive integers starting from 1 until the sum of those integers is greater than 500,
 * the program prints out how many iterations were required to do this.</li></ol>
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Main {
    /**
     * Prints a times table and calculates how many successive integers to add to make a total over 500.
     */
    public static void main(String[] args) {
        Toolbox myToolbox = new Toolbox();      // Creates a new toolbox.

        // The user is asked to enter a number.
        int number = myToolbox.readIntegerFromCmd();
        int sum = 0;
        int integerToSum = 1;
        Iterator<User> iter;

        /**
         * Uses a traditional for loop to output a multiplication table up to 20 times the {@code userNumber}.
         */
        for(int i=1; i<21; i++) {
            System.out.println(number * i);
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
         * Creates two {@link UserGroup} objects and calls {@link #addSampleData()} and {@link #printUsernames()}.
         */
        UserGroup myUserGroup = new UserGroup();
        UserGroup administrators = new UserGroup();
        myUserGroup.addSampleData();
        myUserGroup.printUsernames();

        /**
         * Uses the {@code Iterator} returned by {@link #getUserIterator()} to loop through the existing Users and adds any
         * users whose {@code userType} is "admin" to the administrators group.
         */
        iter = getUserIterator();

        /* Iterating over the ArrayList, the iterator saves the {@link User}'s {@code userType} in a variable useful to perform
        the next operation. */
        while (iter.hasNext()) {
            String userType = iter.next().getUserType();

            // If the {@code userType} is "admin", it adds the {@link User} to the administrators group.
            if (userType.equals("admin")) {
                administrators.add(iter);
            }
        }
        administrators.printUsernames();

        /**
         * Using {@link #setUserType()}, we set the {@code userType} of the last {@link User} in the administrators ArrayList back
         * to "user". Note that, despite changing its {@code userType}, the {@link User} will still be part of the administrators.
         */
        administrators.get(administrators.size()).setUserType("user");

        // Prints the contents of both the {@link UserGroup} objects.
        myUserGroup.printUsernames();
        administrators.printUsernames();
    }
}
