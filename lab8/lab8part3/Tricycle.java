/**
 * This program defines a Tricycle, extending the Cycle superclass.
 * Every Tricycle, apart from the properties and methods inherited from {@link Cycle} has a {@code riderName}.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Tricycle extends Cycle{
    private String riderName;       // The name of the rider.

    /**
     * This is the {@link Tricycle} class constructor.
     *
     * @param onBoardPassengers         the number of passengers on board
     * @param riderName                 the name of the rider
     */
    public Tricycle(int onBoardPassengers, String riderName) {
        super(onBoardPassengers);
        this.riderName = riderName;
    }

   
    /**
     * Prints out a message saying that the {@link Tricycle} is departing from the location passed as parameter.
     *
     * @param here              the place from where the car is departing
     */
    @Override
    public void departing(String here) {
        System.out.println("The tricycle ridden by " + riderName + " departing from " + here + " in time.");
    }

    /**
     * Prints out a message saying that the {@link Tricycle} is arriving to the destination passed as parameter.
     *
     * @param destination       the destination of the journey
     */
    @Override
    public void arriving(String destination) {
        System.out.println("The tricycle ridden by " + riderName + " is arriving to " + destination + " in time.");
    }
}
