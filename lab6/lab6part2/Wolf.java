/**
 * This program defines a Wolf, extending the Animal superclass.
 * Every Wolf object has a name and an age specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 */
public class Wolf extends Animal {

    /**
     * This is the Wolf class constructor.
     * It takes a String and an integer as parameters and sets them as name and age of the wolf.
     */
    public Wolf(String name, int age) {
        super(name, age);
    }

    /**
     * When the method makeNoise() is called, it prints out the typical wolf sound.
     */
    public void makeNoise() {
        System.out.println("Howl!");
    }
}