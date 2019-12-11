/**
 * This program defines an Omnivore, extending the Animal superclass.
 *
 * @author Giovanni Arcudi
 */
public abstract class Omnivore extends Animal {

    /**
     * This is the Omnivore class constructor.
     *
     * @param name      the name of the omnivore
     * @param age       the age of the omnivore
     */
    public Omnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out a message saying that the omnivore is eating the given food.
     *
     * @param food      the food the omnivore has to eat
     */
    public void eat(Food food){
        System.out.println("I am eating " + food.getName());
    }
}
