/**
 * This program defines Food, and is the superclass of all other foods' classes.
 * Every Food has a name specified when it is created, and a relative getter method.
 *
 * @author Giovanni Arcudi
 */
public class Food {
    private String name;

    /**
     * This is the Food class constructor.
     * It takes a String as parameter and sets it as name of the food.
     */
    public Food(String name) {
        this.name = name;
    }

    /**
     * When the method getName() is called, it returns the name of the food.
     */
    public String getName() {
        return name;
    }
}