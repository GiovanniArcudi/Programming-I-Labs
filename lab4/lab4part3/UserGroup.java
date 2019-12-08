import java.util.ArrayList;
import java.util.Iterator;

/**
 * Every {@link UserGroup} cointains an ArrayList of Users and some methods to operate with them.
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public class UserGroup {
    private ArrayList<User> group;      // The ArrayList storing all the users.
    
    /**
     * This is the {@link UserGroup} class constructor.
     * Every {@link UserGroup} created by the constructor will have a {@code group}'s ArrayList.
     */
    public UserGroup() {
        group = new ArrayList<User>();
    }
    
    /**
     * {@link UserGroup}'s {@code group} accessor method.
     *
     * @return the ArrayList storing all the users
     */
    public ArrayList<User> getUsers() {
        return group;
    }


    /**
     * Creates 10 {@link User} objects and puts them into the {@code group} ArrayList.
     */
    public void addSampleData () {
        for(int i=0; i<10; i++) {
            User myUser = new User("test","test","test");
            group.add(myUser);
        }
    }

    /**
     * Takes an int as a parameter and returns the {@link User} in that slot of the {@code group} ArrayList.
     */
    public User getUser(int i) {
        return group.get(i);
    }

    /**
     * Loops through the {@code group} ArrayList printing the {@code username} and {@code userType} of each {@link User}.
     */
    public void printUsernames() {
        for(User user : group) {
            System.out.println(user.getUsername() + " " + user.getUserType());
        }
    }

    /**
     * Removes the first {@link User} (index position 0) from the {@code group} ArrayList.
     */
    public void removeFirstUser() {
        group.remove(0);
    }

    /**
     * Removes the last {@link User} from the {@code group} ArrayList.
     * To know the index position of the last element we use {@link #size()} - which gives the number of users in
     * the ArrayList - minus one (because index starts from 0 and not 1).
     */
    public void removeLastUser() {
        group.remove(group.size() - 1);
    }

    /**
     * Takes a String as a parameter which is the {@code username} of the {@lik User} you want to remove.
     * Using an Iterator, it iterates over the {@code group} Arraylist until it finds the {@link User} with that {@code username}
     * and removes it.
     */
    public void removeUser(String userToRemoveUsername) {
        Iterator<User> iter = group.iterator();

        /* Iterating over the ArrayList, the iterator saves the {@link User} object's {@code username} in a variable useful to perform
        the next operation. */
        while (iter.hasNext()) {
            String userToRemove = iter.next().getUsername();

            // If the {@link User}'s {@code username} is the same as the one we want to remove, it is removed.
            if (userToRemoveUsername .equals(userToRemove)) {
                iter.remove();
            }
        }
    }

    /**
     * Returns the Iterator from the {@code group} ArrayList.
     */
    public Iterator getUserIterator() {
        return group.iterator();
    }
}
