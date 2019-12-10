/**
 * This program defines an Omnivore, extending the {@link Animal} superclass.
 * Every Omnivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class Omnivore extends Animal {

    /**
     * This is the {@link Omnivore} class constructor.
     * It takes a String and an integer as parameters and sets them as {@code name} and {@code age} of the new {@link Omnivore}.
     */
    public Omnivore(String name, int age) {
        super(name, age);
    }
}
