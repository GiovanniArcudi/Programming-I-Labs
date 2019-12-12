/**
 * This program defines a Herbivore, extending the {@link Animal} superclass.
 * Every Herbivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public abstract class Herbivore extends Animal {

    /**
     * This is the {@link Herbivore} class constructor.
     * It takes a String and an integer as parameters and sets them as {@code name} and {@code age} of the {@link Herbivore}.
     */
    public Herbivore(String name, int age) {
        super(name, age);
    }

    /**
     * If the {@link Food} object passed as parameter is an istance of {@link Plant}, it prints out a message saying that
     * the {@link Animal} is eating the given food, else it throws an Exeption.
     */
    public void eat(Food food) throws Exception {
        if (food instanceof Meat) {
            throw new Exception("Herbivores don't eat meat");
        }
        System.out.println("I am eating " + food.getName());
    }
}
