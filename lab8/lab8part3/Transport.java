/**
 * This program defines a mean of transport, and is the abstract superclass of all other transport vehicles' classes.
 * Every Transport object has a specific nuber of {@code onBoardPassengers} and two methods: {@link #departing(String)}
 * and {@link #arriving(String)}
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class Transport {
    private int onBoardPassengers;      // The number of of passenger on board.

    /**
     * This is the {@link Transport} class constructor.
     * It takes an int and sets it as number of {@code onBoardPassengers}.
     *
     * @param onBoardPassengers      the number of passengers on board
     */
    public Transport(int onBoardPassengers) {
        this.onBoardPassengers = onBoardPassengers;
    }

    /**
     * This abstract method prints out a message saying that the {@link Transport} vehicle is departing.
     * As different transport vehicles have different ways of moving, each class has to provide its own implementation
     * of this method.
     *
     * @param here              the place from where the transport vehicle is departing
     */
    public abstract void departing(String here);

    /**
     * This abstract method prints out a message saying that the {@link Transport} vehicle is arriving to destination.
     * As different transport vehicles have different ways of moving, each class has to provide its own implementation
     * of this method.
     *
     * @param destination       the destination of the journey
     */
    public abstract void arriving(String destination);
}
