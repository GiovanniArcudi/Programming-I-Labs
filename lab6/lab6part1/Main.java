/**
 * This program demonstrates that it is possible to create wolf and parrot objects and use the methods defined in the
 * Animal superclass. It also creates a Meat and a Plant object.
 *
 * @author Giovanni Arcudi
 */
public class Main {

    /**
     * Creates a Wolf, a Parrot, a Meat and a Plant object.
     */
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");
    }
}