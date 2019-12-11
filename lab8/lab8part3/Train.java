/**
 * This program defines a Train, extending the Transport superclass.
 * It also implements the Refuelable interface.
 *
 * @author Giovanni Arcudi
 */
public class Train extends Transport implements Refuelable{
    private int trainNumber;        // The number of the train.

    /**
     * This is the Train class constructor.
     *
     * @param onBoardPassengers      the number of passengers on board
     * @param trainNumber            the number of the train
     */
    public Train(int onBoardPassengers, int trainNumber) {
        super(onBoardPassengers);
        this.trainNumber = trainNumber;
    }

    @Override
    /**
     * Prints out a message saying that the train is departing from a certain location.
     *
     * @param here              the place from where the train is departing
     */
    public void departing(String here) {
        System.out.println("The train " + trainNumber + " is departing from " + here + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the train is arriving to destination.
     *
     * @param destination       the destination of the journey
     */
    public void arriving(String destination) {
        System.out.println("The train " + trainNumber + " is arriving to " + destination + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the train has been refuelled with the specified quantity and type of fuel.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The train has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
