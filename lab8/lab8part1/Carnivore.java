/**
 * This program defines a Carnivore, extending the Animal superclass.
 *
 * @author Giovanni Arcudi
 */
public abstract class Carnivore extends Animal {

    /**
     * This is the Carnivore class constructor.
     *
     * @param name      the name of the carnivore
     * @param age       the age of the carnivore
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Prints out a message saying that the carnivore is eating the given food.
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
     * This is the second Carnivore class constructor.
     * It sets the age of a new Carnivore to 0 and name to "newborn", as specified in the Animal class constructor.
     */
    public Carnivore() {
        super();
    }
}
