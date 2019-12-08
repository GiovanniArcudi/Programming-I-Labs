/**
 * Every {@link User} object has a string cointaining the {@code username}, a string cointaining the
 * {@code userType} ("user", "editor" or "admin") and a string cointaining the {@code name} of the user.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class User {
    private String username;        // The user's username.
    private String userType;        // The type of user.
    private String name;            // The real name of the user.

    /**
     * This is the {@link User} class constructor.
     * It takes the {@code username}, {@code userType} and {@code name} as parameters to set the object's variables.
     */
    public User(String username, String userType, String name) {
        this.username = username;
        this.userType = userType;
        this.name = name;
    }

    /**
     * {@link User}'s {@code username} accessor method.
     *
     * @return the user's username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * {@link User}'s {@code userType} accessor method.
     *
     * @return the user type
     */
    public String getUserType() {
        return userType;
    }
    
    /**
     * {@link User}'s {@code name} accessor method.
     *
     * @return user's real name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@code userType} of the {@link User} object to the type passed as a parameter.
     */
    public void setUserType(String type) {
        userType = type;
    }
}
