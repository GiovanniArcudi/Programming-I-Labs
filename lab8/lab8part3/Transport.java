/**
 * This program defines Transport, and is the abstract superclass of all other transport vehicles' classes.
 *
 * @author Giovanni Arcudi
 */
public abstract class Transport {
    private int onBoardPassengers;      // The number of of passenger on board.

    /**
     *  This is the Transport class constructor.
     *
     * @param onBoardPassengers      the number of passengers on board
     */
    public Transport(int onBoardPassengers) {
        this.onBoardPassengers = onBoardPassengers;
    }

    /**
     * This abstract method prints out a message saying that the transport vehicle is departing.
     * As different transport vehicles have different ways of moving, each class has to provide its own implementation
     * for this method.
     *
     * @param here              the place from where the transport vehicle is departing
     */
    public abstract void departing(String here);

    /**
     * This abstract method prints out a message saying that the transport vehicle is arriving to destination.
     * As different transport vehicles have different ways of moving, each class has to provide its own implementation
     * for this method.
     *
     * @param destination       the destination of the journey
     */
    public abstract void arriving(String destination);
}
