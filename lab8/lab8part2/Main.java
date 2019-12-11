/**
 * This program demonstrates that it is possible to create animals objects and use the methods defined in the Animal
 * superclass. It also creates a Meat and a Plant object.
 *
 * @author Giovanni Arcudi
 */
public class Main {

    /**
     * Performs different tasks for the three parts of the lab.
     */
    public static void main(String[] args) throws Exception {

        /**
         * (Lab 6 Part I) Creates a Wolf, a Parrot, a Meat and a Plant object. Then it calls makeNoise() method on the wolf.
         */
        Wolf wolf = new Wolf("Giovanni", 18);
        Parrot parrot = new Parrot("Alessandro", 18);
        Cow cow = new Cow("Jury", 20);
        Meat beef = new Meat("Beef");
        Plant chicory = new Plant("Chicory");

        wolf.makeNoise();

        /**
         * (Lab 6 Part II) Calls the abstract makeNoise() method on the wolf.
         */
        wolf.makeNoise();

        /**
         * (Lab 6 Part III) Calls the eat() method on the wolf, the cow and the parrot, expecting to catch exceptions for
         * the last two cases.
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
         * (Lab 8 Part I) After having overloaded the eat method in the Animal class, I now test its functionality for
         * an instance of the wolf class.
         */
        wolf.eat(beef, 3);

        /**
         * (Lab 8 Part I) After having overloaded the Animal class constructor, I now test its functionality for an
         * instance of the wolf class.
         */
        Wolf wolfConstructorTest = new Wolf();
    }
}