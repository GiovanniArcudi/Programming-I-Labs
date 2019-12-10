/**
 * This program defines a Wolf, extending the {@link Animal} superclass.
 * Every Wolf object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Wolf extends Animal {

    /**
     * This is the {@link Wolf} class constructor.
     * It takes a String and an int as parameters and sets them as {@code name} and {@code age} of the {@link Wolf}.
     */
    public Wolf(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out the typical {@link Wolf} sound.
     */
    public void makeNoise() {
        System.out.println("Howl!");
    }
}
