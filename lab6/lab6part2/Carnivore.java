/**
 * This program defines a Carnivore, extending the Animal superclass.
 * Every Carnivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class Carnivore extends Animal {

    /**
     * This is the Carnivore class constructor.
     * It takes a String and an integer as parameters and sets them as {@code name} and {@code age} of the {@link Carnivore}.
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }
}
