/**
 * This program defines a Carnivore, extending the Animal superclass.
 * Every Carnivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public abstract class Carnivore extends Animal {

    /**
     * This is the Carnivore class constructor.
     * It takes a String and an integer as parameters and sets them as {@code name} and {@code age} of the {@link Carnivore}.
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }

    /**
     * If the {@link Food} object passed as parameter is an istance of {@link Meat}, it prints out a message saying that
     * the {@link Animal} is eating the given food, else it throws an Exeption.
     */
    public void eat(Food food) throws Exception {
        if(food instanceof Plant) {
            throw new Exception("Carnivores don't eat plants");
        }
        System.out.println("I am eating " + food.getName());
    }
}
