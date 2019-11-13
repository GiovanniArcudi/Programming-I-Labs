/**
 * This program defines a Herbivore, extending the Animal superclass.
 * Every Herbivore object has a name and an age specified when it is created.
 *
 * @author Giovanni Arcudi
 */
public abstract class Herbivore extends Animal {

    /**
     * This is the Herbivore class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Herbivore.
     */
    public Herbivore(String name, int age) {
        super(name, age);
    }
}
