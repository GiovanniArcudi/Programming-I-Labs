/**
 * This program defines a Carnivore, extending the Animal superclass.
 * Every Carnivore object has a name and an age specified when it is created.
 *
 * @author Giovanni Arcudi
 */
public abstract class Carnivore extends Animal {

    /**
     * This is the Carnivore class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Carnivore.
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }
}
