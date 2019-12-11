/**
 * This program defines an Animal, and is the abstract superclass of all other animals' classes.
 * It also implements Comparable<Animal> interface.
 *
 * @author Giovanni Arcudi
 */
public abstract class Animal implements Comparable<Animal>{
    private String name;        // The name of the animal.
    private int age;            // The age of the animal.

    /**
     *  This is the Animal class constructor.
     *
     * @param name      the name of the animal
     * @param age       the age of the animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Animal's name accessor method.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Animal's age accessor method.
     *
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     * This abstract method prints out the Animal's typical sound.
     * As different animals make different noises, each class has to provide its own implementation for making a noise.
     */
    public abstract void makeNoise();

    /**
     * This abstract method prints out a message saying that the animal is eating the given food.
     * As different animals eat different foods, each class has to provide its own implementation for eating.
     *
     * @param food              the food the animal has to eat
     * @throws Exception        If the animal cannot eat that type of food
     */
    public abstract void eat(Food food) throws Exception;

    /**
     * This abstract method prints out a specific number of times a message saying that the animal is eating the given food.
     *
     * @param food              the food the animal has to eat
     * @param times             the number of times to print out the message
     * @throws Exception        If the animal cannot eat that type of food
     */
    public void eat(Food food, int times) throws Exception {
        for(int i = 0; i < times; i++) {
            this.eat(food);
        }
    }

    /**
     * This is the second Animal class constructor.
     * By default, it sets the age of a new Animal to 0 and name to "newborn".
     */
    public Animal() {
        this("newborn", 0);
    }

    /**
     * Compares the ages of the animals.
     *
     * @param compareToAnimal    the animal we want to compare to the current object
     * @return 0,                if the objects have the same age
     *         a positive value, if the current object's age is greater than the given object's one
     *         a negative value, if the current object's age is less than given object's one
     */
    public int compareTo(Animal compareToAnimal) {
        return this.getAge()-compareToAnimal.getAge();
    }
}