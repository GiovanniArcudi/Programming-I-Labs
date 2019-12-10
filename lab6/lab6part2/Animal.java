/**
 * Every {@link Animal} has a {@code name} and an {@code age} specified when it is created, and the relative getter methods.
 *
 * @author Giovanni Arcudi
 * @version 2.0
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
}
