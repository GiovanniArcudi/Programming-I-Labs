/**
 * This program demonstrates that it is possible to create wolf and parrot objects and use the methods defined in the
 * Animal superclass. It also creates a Meat and a Plant object.
 *
 * @author Giovanni Arcudi
 */
public class Main {

    /**
     * Performs different tasks for the three parts of the lab.
     */
    public static void main(String[] args) {

        /**
         * (Part I) Creates a Wolf, a Parrot, a Meat and a Plant object. Then it calls makeNoise() method on the wolf.
         */
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");

        wolf.makeNoise();

        /**
         * (Part II) Calls the abstract makeNoise() method on the wolf.
         */
        wolf.makeNoise();
    }
}