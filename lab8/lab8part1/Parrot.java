/**
 * This program defines a Parrot, extending the Omnivore superclass.
 *
 * @author Giovanni Arcudi
 */
public class Parrot extends Omnivore {

    /**
     * This is the Parrot class constructor.
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
     * This is the second Parrot class constructor.
     * It sets the input integer as age of a Parrot called "Polly" by default.
     *
     * @param age       the age of the parrot
     */
    public Parrot(int age) {
        this("Polly", age);
    }
}