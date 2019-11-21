/**
 * This program defines a Parrot, extending the Omnivore superclass.
 * Every Parrot object has a name and an age specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 */
public class Parrot extends Omnivore {

    /**
     * This is the Parrot class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Parrot.
     */
    public Parrot(String name, int age) {
        super(name, age);
    }

    /**
     * When the method makeNoise() is called, it prints out the typical Parrot sound.
     */
    public void makeNoise() {
        System.out.println("Chirp!");
    }
}