/**
 * This program defines a User. Every User object has a string cointaining the username, a string cointaining the
 * usertype ('user', 'editor' or 'admin') and a string cointaining the real name of the user.
 *
 * @author Giovanni Arcudi
 */
public class User {
    private String username;
    private String userType;
    private String name;

    /**
     * This is the User class constructor.
     * It takes the username, userType and name as parameters to set the object's variables.
     */
    public User(String username, String userType, String name) {
        this.username = username;
        this.userType = userType;
        this.name = name;
    }

    /**
     * When the method getUsername() is called, it returns the username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * When the method getUserType() is called, it returns the type of user ('user', 'editor' or 'admin').
     */
    public String getUserType() {
        return userType;
    }

    /**
     * When the method getName() is called, it returns the name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * When the method setUserType(String type) is called, it sets the user type of the User object to what the method
     * has received as a parameter.
     */
    public void setUserType(String type) {
        userType = type;
    }
}
