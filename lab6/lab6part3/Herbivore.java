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

    /**
     * When the method eat() is called, if the food given as parameter is a plant, it prints out a message saying that
     * the animal is eating the given food, else it throws an Exeption.
     */
    public void eat(Food food) throws Exception {
        if(food instanceof Meat) {
            throw new Exception("Herbivores don't eat meat");
        }
        System.out.println("I am eating " + food.getName());
    }
}
