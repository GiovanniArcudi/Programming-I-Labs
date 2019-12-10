/**
 * This program defines a Plant, extending the {@link Food} superclass.
 * Every Plant has a {@code name} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Plant extends Food {

    /**
     * This is the {@link Plant} class constructor.
     * It takes a String as parameter and sets it as {@code name} of the {@link Plant}.
     */
    public Plant(String name) {
        super(name);
    }
}
