/**
 * This program defines an Omnivore, extending the {@link Animal} superclass.
 * Every Omnivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 4.0
 */
public abstract class Omnivore extends Animal {

    /**
     * This is the {@link Omnivore} class constructor.
     *
     * @param name      the name of the omnivore
     * @param age       the age of the omnivore
     */
    public Omnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out a message saying that the {@link Omnivore} is eating the {@link Food} object passed as parameter.
     *
     * @param food      the food the omnivore has to eat
     */
    public void eat(Food food){
        System.out.println("I am eating " + food.getName());
    }
}
