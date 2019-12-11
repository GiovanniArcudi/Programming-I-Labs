/**
 * This program defines a Wolf, extending the Carnivore superclass.
 *
 * @author Giovanni Arcudi
 */
public class Wolf extends Carnivore {

    /**
     * This is the Wolf class constructor.
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
     * This is the second Wolf class constructor.
     * It sets the age of a new Wolf to 0 and name to "newborn", as specified in the Animal class constructor.
     */
    public Wolf() {
        super();
    }
}