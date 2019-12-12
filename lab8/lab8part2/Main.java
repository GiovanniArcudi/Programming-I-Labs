/**
 * This program demonstrates that it is possible to create {@link Wolf} and {@link Parrot} objects and use the
 * methods inherited by the {@link Animal} superclass.
 *
 * @author Giovanni Arcudi
 * @version 5.0
 */
public class Main {
    public static void main(String[] args) throws Exception {

        /**
         * (Lab 6 Part I) Creates a {@link Wolf}, a {@link Parrot}, a {@link Meat} and a {@link Plant} object.
         */
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Cow cow = new Cow("Jury", 20);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");

        wolf.makeNoise();
        
        /**
         * (Lab 6 Part II) Calls the abstract {@link #makeNoise()} method on the {@link Wolf} object.
         */
        wolf.makeNoise();

        /**
         * (Lab 6 Part III) Calls the {@link #eat()} method on the {@link Wolf}, the {@link Cow} and the {@link Parrot}, 
         * expecting to catch exceptions for the last two cases.
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

        /**
         * (Lab 8 Part I) After having overloaded the {@link #eat()} method in the {@link Animal} class, I now test its
         * functionality for an instance of the {@link Wolf} class.
         */
        wolf.eat(beef, 3);

        /**
         * (Lab 8 Part I) After having overloaded the {@link Animal} class constructor, I now test its functionality for 
         * an instance of the {@link Wolf} class.
         */
        Wolf wolfConstructorTest = new Wolf();
    }
}
