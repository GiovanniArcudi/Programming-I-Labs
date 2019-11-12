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

        int number = myToolbox.readIntegerFromCmd();        // The user is asked to enter a number.
        int sum = 0;
        int integerToSum = 1;
        Iterator<User> iter;

        /**
         * Uses a traditional for loop to output a multiplication table up to 20 times the number specified by the user.
         */
        for(int i=1; i<21; i++) {
            System.out.println(number * i);
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
         * Creates two UserGroup objects and calls the methods addSampleData() and printUsernames().
         */
        UserGroup myUserGroup = new UserGroup();
        UserGroup administrators = new UserGroup();
        myUserGroup.addSampleData();
        myUserGroup.printUsernames();

        /**
         * Uses the Iterator returned by the getUserIterator() method to loop through the existing Users and adds any
         * users whose userType is "admin" to the administrators group.
         */
        iter = getUserIterator();

        /* Iterating over the ArrayList, the iterator saves the User object's user type in a variable useful to perform
        the next operation. */
        while (iter.hasNext()) {
            String userType = iter.next().getUserType();

            // If the User's userType is "admin", it is added to the administrators group.
            if (userType.equals("admin")) {
                administrators.add(iter);
            }
        }

        // Using the printUsernames() method to print out all the users in the administrators list.
        administrators.printUsernames();

        /**
         * Using the setUserType() method, we set the user type of the last user in the administrators ArrayList back
         * to "user". Note that, despite changing user's type, the User will still be part of the administrators ArrayList.
         */
        administrators.get(administrators.size()).setUserType("user");

        // Printing the contents of both the UserGroups.
        myUserGroup.printUsernames();
        administrators.printUsernames();
    }
}
