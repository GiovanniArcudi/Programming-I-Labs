/**
 * This program defines a Plant, extending the Food superclass.
 * Every Plant has a name specified when it is created.
 *
 * @author Giovanni Arcudi
 */
public class Plant extends Food {

    /**
     * This is the Plant class constructor.
     * It takes a String as parameter and sets it as name of the Plant.
     */
    public Plant(String name) {
        super(name);
    }
}