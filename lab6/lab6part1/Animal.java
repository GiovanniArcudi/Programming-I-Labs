/**
 * This program defines an Animal, and is the superclass of all other animals' classes.
 * Every Animal has a name and an age specified when it is created, and the relative getter methods.
 *
 * @author Giovanni Arcudi
 */
public class Animal {
    private String name;
    private int age;

    /**
     * This is the Animal class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the Animal.
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * When the method getName() is called, it returns the name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * When the method getAge() is called, it returns the name of the animal.
     */
    public int getAge() {
        return age;
    }
}