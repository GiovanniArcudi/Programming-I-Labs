/**
 * This program defines a Meat object, extending the {@link Food} superclass.
 * Every Meat has a {@code name} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Meat extends Food {

    /**
     * This is the {@link Meat} class constructor.
     * It takes a String as parameter and sets it as {@code name} of the {@link Meat} object.
     */
    public Meat(String name) {
        super(name);
    }
}
