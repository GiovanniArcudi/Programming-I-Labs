/**
 * This program defines a UserGroup.
 * Every UserGroup cointains an ArrayList of Users and some methods to operate with them.
 *
 * @author Giovanni Arcudi
 */
import java.util.ArrayList;     // Importing the ArrayList library.
import java.util.Iterator;     // Importing the Iterator library.

public class UserGroup {
    private ArrayList<User> group;

    /**
     * This is the UserGroup class constructor.
     * Every UserGroup created by the constructor will have an ArrayList of Users called "group".
     */
    public UserGroup(){
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
    public User getUser(int i){
        return group.get(i);
    }

    /**
     *  When the method printUsernames() is called, it loops through the ArrayList using an enhanced for loop and prints
     *  the username and userType of each user in the ArrayList.
     */
    public void printUsernames() {
        for(User user : group){
            System.out.println(user.getUsername() + " " + user.getUserType());
        }
    }

    /**
     * When the method removeFirstUser() is called, it removes the first User (index position 0) from the ArrayList.
     */
    public void removeFirstUser(){
        group.remove(0);
    }

    /**
     * When the method removeLastUser() is called, it removes the last user from the list.
     * To know the index position of the last element we use group.size() - which gives the number of users in
     * the ArrayList - minus one (because index starts from 0 and not 1).
     */
    public void removeLastUser(){
        group.remove(group.size() - 1);
    }

    /**
     * The method removeUser(String userToRemoveUsername) takes a String as a parameter which is the username you want
     * to remove. Using an Iterator, it iterates over the Users Arraylist until it finds the user with that username
     * and remove them.
     */
    public void removeUser(String userToRemoveUsername) {
        Iterator<User> iter = group.iterator();     // Setting the Iterator.

        /* Iterating over the ArrayList, the iterator saves the User object's username in a variable useful to perform
        the next operation. */
        while (iter.hasNext()) {
            String userToRemove = iter.next().getUsername();

            // If the User's username is the same as the username we want to remove, it is removed.
            if (userToRemoveUsername .equals(userToRemove)) {
                iter.remove();
            }
        }
    }

    /**
     * When the method getUserIterator() is called, it returns an Iterator from the ArrayList.
     */
    public Iterator getUserIterator(){
        return group.iterator();
    }
}