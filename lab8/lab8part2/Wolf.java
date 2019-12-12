/**
 * This program defines a Wolf, extending the {@link Carnivore} superclass.
 * Every Wolf object has a {@code name} and an {@code age} specified when it is created and a method to make noise.
 *
 * @author Giovanni Arcudi
 * @version 5.0
 */
public class Wolf extends Carnivore {

    /**
     * This is the {@link Wolf} class constructor.
     *
     * @param name      the name of the wolf
     * @param age       the age of the wolf
     */
    public Wolf(String name, int age) {
        super(name, age);
    }

    /**
     * It prints out the typical wolf sound.
     */
    public void makeNoise() {
        System.out.println("Howl!");
    }
    
    /**
     * This is the second {@link Wolf} class constructor.
     * It sets the {@code age} of a new {@link Wolf} to 0 and {@code name} to "newborn".
     */
    public Wolf() {
        super();
    }
}
