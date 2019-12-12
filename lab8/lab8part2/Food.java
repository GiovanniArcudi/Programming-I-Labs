/**
 * This program defines Food, and is the superclass of all other foods' classes.
 * Every Food object has a {@code name} specified when it is created, and a relative getter method.
 *
 * @author Giovanni Arcudi
 * @version 4.0
 */
public class Food {
    private String name;        // The name of the food.

    /**
     * This is the {@link Food} class constructor.
     *
     * @param name      the name of the food
     */
    public Food(String name) {
        this.name = name;
    }

    /**
     * Food's {@code name} accessor method.
     *
     * @return the name of the food
     */
    public String getName() {
        return name;
    }
}
