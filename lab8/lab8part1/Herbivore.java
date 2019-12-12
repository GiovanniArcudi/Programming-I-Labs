/**
 * This program defines a Herbivore, extending the {@link Animal} superclass.
 * Every Herbivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public abstract class Herbivore extends Animal {

    /**
     * This is the Herbivore class constructor.
     *
     * @param name      the name of the herbivore
     * @param age       the age of the herbivore
     */
    public Herbivore(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out a message saying that the {@link Herbivore} is eating the {@link Food} object passed as parameter.
     *
     * @param food              the food the herbivore has to eat
     * @throws Exception        If the food given as parameter is meat
     */
    public void eat(Food food) throws Exception {
        if (food instanceof Meat) {
            throw new Exception("Herbivores don't eat meat");
        }
        System.out.println("I am eating " + food.getName());
    }
}
