/**
 * This program defines a Cow, extending the Herbivore superclass.
 * Every Cow object has a name and an age specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 */
public class Cow extends Herbivore {

    /**
     * This is the Cow class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Cow.
     */
    public Cow(String name, int age) {
        super(name, age);
    }

    /**
     * When the method makeNoise() is called, it prints out the typical cow sound.
     */
    public void makeNoise() {
        System.out.println("Muu!");
    }
}