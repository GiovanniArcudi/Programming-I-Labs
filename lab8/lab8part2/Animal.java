/**
 * Every {@link Animal} has a {@code name} and an {@code age} specified when it is created, the relative getter methods,
 * and two abstract methods: {@link #makeNoise()} and {@link #eat()}.
 * It also implements Comparable<Animal> interface.
 
 * @author Giovanni Arcudi
 * @version 5.0
 */
public abstract class Animal implements Comparable<Animal> {
    private String name;        // The name of the animal.
    private int age;            // The age of the animal.

    /**
     * This is the {@link Animal} class constructor.
     *
     * @param name      the name of the animal
     * @param age       the age of the animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Animal's {@code name} accessor method.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Animal's {@code age} accessor method.
     *
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }
    
    /**
     * This abstract method prints out the Animal's typical sound.
     * As different animals make different noises, each class has to provide its own implementation for {@link #makeNoise()}.
     */
    public abstract void makeNoise();
    
    /**
     * This abstract method prints out a message saying that the animal is eating the given food.
     * As different animals eat different foods, each class has to provide its own implementation for {@link #eat()}.
     *
     * @param food              the food the animal has to eat
     * @throws Exception        If the animal cannot eat that type of food
     */
    public abstract void eat(Food food) throws Exception;

    /**
     * This abstract method prints out a specific number of times a message saying that the {@link Animal} is eating the given food.
     *
     * @param food              the food the animal has to eat
     * @param times             the number of times to print out the message
     * @throws Exception        If the animal cannot eat that type of food
     */
    public void eat(Food food, int times) throws Exception {
        for (int i = 0; i < times; i++) {
            this.eat(food);
        }
    }
    
    /**
     * This is the second {@link Animal} class constructor.
     * By default, it sets the {@code age} of a new {@link Animal} to 0 and {@code name} to "newborn".
     */
    public Animal() {
        this("newborn", 0);
    }

    /**
     * Compares the {@code age} of this {@link Animal} object with the one of the {@link Animal} object passed as parameter.
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
