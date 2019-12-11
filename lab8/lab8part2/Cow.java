/**
 * This program defines a Cow, extending the Herbivore superclass.
 *
 * @author Giovanni Arcudi
 */
public class Cow extends Herbivore {

    /**
     * This is the Cow class constructor.
     *
     * @param name      the name of the cow
     * @param age       the age of the cow
     */
    public Cow(String name, int age) {
        super(name, age);
    }

    /**
     * It prints out the typical cow sound.
     */
    public void makeNoise() {
        System.out.println("Muu!");
    }
}