import java.util.ArrayList;

/**
 * Every {@link UserGroup} cointains an ArrayList of Users and some methods to operate with them.
 *
 * @author Giovanni Arcudi
 * @version 1.0
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
}
