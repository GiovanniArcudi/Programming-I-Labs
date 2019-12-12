/**
 * This program defines a Plant, extending the {@link Food} superclass.
 * Every Plant has a {@code name} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 5.0
 */
public class Plant extends Food {
    
    /**
     * This is the {@link Plant} class constructor.
     *
     * @param name      the name of the plant
     */
    public Plant(String name) {
        super(name);
    }
}
