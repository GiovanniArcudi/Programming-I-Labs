/**
 * This program defines Food, and is the superclass of all other foods' classes.
 *
 * @author Giovanni Arcudi
 */
public class Food {
    private String name;        // The name of the food.

    /**
     * This is the Food class constructor.
     *
     * @param name      the name of the food
     */
    public Food(String name) {
        this.name = name;
    }

    /**
     * Food's name accessor method.
     *
     * @return the name of the food
     */
    public String getName() {
        return name;
    }
}