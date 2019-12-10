/**
 * This program demonstrates that it is possible to create {@link Wolf} and {@link Parrot} objects and use the
 * methods inherited by the {@link Animal} superclass. It also creates 2 new {@link Meat} and a {@link Plant} objects.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Creates a {@link Wolf}, a {@link Parrot}, a {@link Meat} and a {@link Plant} object.
         */
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Cow cow = new Cow("Jury", 20);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");

        /**
         * Calls the abstract {@link #makeNoise()} method on the {@link Wolf} object.
         */
        wolf.makeNoise();

        /**
         * Calls the {@link #eat()} method on the {@link Wolf}, the {@link Cow} and the {@link Parrot}, expecting to
         * catch exceptions for the last two cases.
         */
        try {
            wolf.eat(beef);
            cow.eat(chicory);
            parrot.eat(beef);
            cow.eat(beef);
            wolf.eat(chicory);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
