/**
 * This program defines a Bicycle, extending the Cycle superclass.
 *
 * @author Giovanni Arcudi
 */
public class Bicycle extends Cycle{
    private String riderName;       // The name of the rider.

    /**
     * This is the Bicycle class constructor.
     *
     * @param onBoardPassengers the number of passengers on board
     * @param riderName         the name of the rider
     */
    public Bicycle(int onBoardPassengers, String riderName) {
        super(onBoardPassengers);
        this.riderName = riderName;
    }

    @Override
    /**
     * Prints out a message saying that the bike is departing from a certain location.
     *
     * @param here              the place from where the car is departing
     */
    public void departing(String here) {
        System.out.println("The bike ridden by " + riderName + " departing from " + here + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the bike is arriving to destination.
     *
     * @param destination       the destination of the journey
     */
    public void arriving(String destination) {
        System.out.println("The bike ridden by " + riderName + " is arriving to " + destination + " in time.");
    }
}
