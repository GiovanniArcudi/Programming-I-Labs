/**
 * Every {@link Animal} has a {@code name} and an {@code age} specified when it is created, the relative getter methods,
 * and two abstract methods: {@link #makeNoise()} and {@link #eat()}.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public abstract class Animal {
    private String name;        // The name of the animal.
    private int age;            // The age of the animal.

    /**
     * This is the {@link Animal} class constructor.
     * It takes a String and an int as parameters and sets them as {@code name} and {@code age} of the {@link Animal}.
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the {@code name} of the {@link Animal}.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the {@code age} of the {@link Animal}.
     * 
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }
    
    /**
     * As different animals make different noises, each class has to provide its own implementation for {@link #makeNoise()}.
     * This is just an abstract method.
     */
    public abstract void makeNoise();

    /**
     * As different animals eat different foods, each class has to provide its own implementation for {@link #eat()}.
     * This is just an abstract method that takes a {@link Food} object as an argument and can throw an Exeption.
     */
    public abstract void eat(Food food) throws Exception;
}
