/**
 * This program defines a Parrot object, extending the Animal superclass.
 * Every Parrot object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 4.0
 */
public class Parrot extends Omnivore {

    /**
     * This is the {@link Parrot} class constructor.
     *
     * @param name      the name of the parrot
     * @param age       the age of the parrot
     */
    public Parrot(String name, int age) {
        super(name, age);
    }

    /**
     * It prints out the typical parrot sound.
     */
    public void makeNoise() {
        System.out.println("Chirp!");
    }

    /**
     * This is the second {@link Parrot} class constructor.
     * It sets the input {@code int} as {@code age} of a {@link Parrot} called "Polly" by default.
     *
     * @param age       the age of the parrot
     */
    public Parrot(int age) {
        this("Polly", age);
    }
}
