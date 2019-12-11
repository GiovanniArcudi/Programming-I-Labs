/**
 * This program defines a Tricycle, extending the Cycle superclass.
 *
 * @author Giovanni Arcudi
 */
public class Tricycle extends Cycle{
    private String riderName;       // The name of the rider.

    /**
     * This is the Tricycle class constructor.
     *
     * @param onBoardPassengers the number of passengers on board
     */
    public Tricycle(int onBoardPassengers, String riderName) {
        super(onBoardPassengers);
        this.riderName = riderName;
    }

    @Override
    /**
     * Prints out a message saying that the tricycle is departing from a certain location.
     *
     * @param here              the place from where the car is departing
     */
    public void departing(String here) {
        System.out.println("The tricycle ridden by " + riderName + " departing from " + here + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the tricycle is arriving to destination.
     *
     * @param destination       the destination of the journey
     */
    public void arriving(String destination) {
        System.out.println("The tricycle ridden by " + riderName + " is arriving to " + destination + " in time.");
    }
}
