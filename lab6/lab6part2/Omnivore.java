/**
 * This program defines an Omnivore, extending the Animal superclass.
 * Every Omnivore object has a name and an age specified when it is created.
 *
 * @author Giovanni Arcudi
 */
public abstract class Omnivore extends Animal {

    /**
     * This is the Omnivore class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Omnivore.
     */
    public Omnivore(String name, int age) {
        super(name, age);
    }
}
