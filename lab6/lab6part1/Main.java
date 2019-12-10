/**
 * This program demonstrates that it is possible to create {@link Wolf} and {@link Parrot} objects and use the
 * methods inherited by the {@link Animal} superclass. It also creates 2 new {@link Meat} and a {@link Plant} objects.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Main {

    /**
     * Creates a {@link Wolf}, a {@link Parrot}, a {@link Meat} and a {@link Plant} object.
     */
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");
    }
}
