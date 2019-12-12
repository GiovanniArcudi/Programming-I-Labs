/**
 * This program defines a Carnivore, extending the Animal superclass.
 * Every Carnivore object has a {@code name} and an {@code age} specified when it is created.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public abstract class Carnivore extends Animal {

    /**
     * This is the {@link Carnivore} class constructor.
     *
     * @param name      the name of the carnivore
     * @param age       the age of the carnivore
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out a message saying that the {@link Carnivore} is eating the given {@link Food} object.
     *
     * @param food              the food the carnivore has to eat
     * @throws Exception        If the food given as parameter is a plant
     */
    public void eat(Food food) throws Exception {
        if(food instanceof Plant) {
            throw new Exception("Carnivores don't eat plants");
        }
        System.out.println("I am eating " + food.getName());
    }
    
    /**
     * This is the second {@link Carnivore} class constructor.
     * It sets the {@code age} of a new Carnivore to 0 and {@code name} to "newborn", as specified in the {@link Animal} class.
     */
    public Carnivore() {
        super();
    }
}
