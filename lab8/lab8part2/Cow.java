/**
 * This program defines a Cow, extending the {@link Herbivore} superclass.
 * Every Cow object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Cow extends Herbivore {

    /**
     * This is the {@link Cow} class constructor.
     *
     * @param name      the name of the cow
     * @param age       the age of the cow
     */
    public Cow(String name, int age) {
        super(name, age);
    }

    /**
     * It prints out the typical {@link Cow} sound.
     */
    public void makeNoise() {
        System.out.println("Muu!");
    }
}
