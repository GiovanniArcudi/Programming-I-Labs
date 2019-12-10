/**
 * Every Food object has a {@code name} specified when it is created, and a relative getter method.
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public class Food {
    private String name;        // The name of the food.
    
    /**
     * This is the {@link Food} class constructor.
     * It takes a String as parameter and sets it as {@code name} of the {@link Food}.
     */
    public Food(String name) {
        this.name = name;
    }

    /**
     * Returns the {@code name} of the {@link Food}.
     *
     *@return the name of the food
     */
    public String getName() {
        return name;
    }
}
