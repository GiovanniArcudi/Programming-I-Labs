/**
 * This program defines a Herbivore, extending the {@link Animal} superclass.
 * Every Herbivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class Herbivore extends Animal {

    /**
     * This is the {@link Herbivore} class constructor.
     * It takes a String and an integer as parameters and sets them as {@code name} and {@code age} of the {@link Herbivore}.
     */
    public Herbivore(String name, int age) {
        super(name, age);
    }
}
