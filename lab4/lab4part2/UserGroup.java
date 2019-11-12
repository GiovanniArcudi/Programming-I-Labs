/**
 * This program defines a UserGroup.
 * Every UserGroup cointains an ArrayList of Users and some methods to operate with them.
 *
 * @author Giovanni Arcudi
 */
import java.util.ArrayList;     // Importing the ArrayList library.

public class UserGroup {
    private ArrayList<User> group;

    /**
     * This is the UserGroup class constructor.
     * Every UserGroup created by the constructor will have an ArrayList of Users called "group".
     */
    public UserGroup() {
        group = new ArrayList<User>();
    }

    /**
     * When the method getUsers() is called, it returns the ArrayList of all the Users in that group.
     */
    public ArrayList<User> getUsers() {
        return group;
    }

    /**
     * When the method addSampleData() is called, it creates 10 Users and using the ArrayList's add() method put the 10
     * new User objects into the "group" ArrayList.
     */
    public void addSampleData () {
        for(int i=0; i<10; i++) {
            User myUser = new User("test","test","test");
            group.add(myUser);
        }
    }

    /**
     * When the method getUser(int i) is called, it takes an int as a parameter and returns the User in that slot of the
     * ArrayList.
     */
    public User getUser(int i) {
        return group.get(i);
    }

    /**
     *  When the method printUsernames() is called, it loops through the ArrayList using an enhanced for loop and prints
     *  the username and userType of each user in the ArrayList.
     */
    public void printUsernames() {
        for(User user : group) {
            System.out.println(user.getUsername() + " " + user.getUserType());
        }
    }
}
