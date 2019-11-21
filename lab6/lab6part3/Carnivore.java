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

    /**
     * When the method eat() is called, if the food given as parameter is meat, it prints out a message saying that the
     * animal is eating the given food, else it throws an Exeption.
     */
    public void eat(Food food) throws Exception {
        if(food instanceof Plant) {
            throw new Exception("Carnivores don't eat plants");
        }
        System.out.println("I am eating " + food.getName());
    }
}
