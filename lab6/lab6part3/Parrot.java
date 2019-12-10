/**
 * This program defines a Parrot object, extending the Animal superclass.
 * Every Parrot object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Parrot extends Omnivore {

    /**
     * This is the {@link Parrot} class constructor.
     * It takes a String and an int as parameters and sets them as {@code name} and {@code age} of the {@link Parrot}.
     */
    public Parrot(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out the typical Parrot sound.
     */
    public void makeNoise() {
        System.out.println("Chirp!");
    }
}
