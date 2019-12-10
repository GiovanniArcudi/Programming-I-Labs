/**
 * This program defines a Cow, extending the {@link Herbivore} superclass.
 * Every Cow object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Cow extends Herbivore {

    /**
     * This is the {@link Cow} class constructor.
     * It takes a String and an int as parameters and sets them as {@code name} and {@code age} of the new {@link Cow}.
     */
    public Cow(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out the typical {@link Cow} sound.
     */
    public void makeNoise() {
        System.out.println("Muu!");
    }
}
