/**
 * This program defines a Train, extending the {@link Transport} superclass and implementing the {@link Refuelable} interface.
 * Every Train, apart from the properties and methods inherited from {@link Transport}, has a {@code trainNumber}.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Train extends Transport implements Refuelable{
    private int trainNumber;        // The number of the train.

    /**
     * This is the Train class constructor.
     * It takes two ints and sets them as {@code onBoardPassengers} and {@code trainNumber}.
     *
     * @param onBoardPassengers      the number of passengers on board
     * @param trainNumber            the number of the train
     */
    public Train(int onBoardPassengers, int trainNumber) {
        super(onBoardPassengers);
        this.trainNumber = trainNumber;
    }

    
    /**
     * Prints out a message saying that the {@link Train} is departing from the location passed as parameter.
     *
     * @param here              the place from where the train is departing
     */
    @Override
    public void departing(String here) {
        System.out.println("The train " + trainNumber + " is departing from " + here + " in time.");
    }

    
    /**
     * Prints out a message saying that the {@link Train} is arriving to the destination passed as parameter.
     *
     * @param destination       the destination of the journey
     */
    @Override
    public void arriving(String destination) {
        System.out.println("The train " + trainNumber + " is arriving to " + destination + " in time.");
    }

    
    /**
     * Prints out a message saying that the train has been refuelled with the specified {@code litres} of {@code typeOfFuel}.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */
    @Override
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The train has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
