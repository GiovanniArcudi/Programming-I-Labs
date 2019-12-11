/**
 * This program defines a Train, extending the Transport superclass.
 * It also implements the Refuelable interface.
 *
 * @author Giovanni Arcudi
 */
public class JetPlane extends Transport implements Refuelable{
    private int jetPlaneNumber;        // The number of the JetPlane.

    /**
     * This is the JetPlane class constructor.
     *
     * @param onBoardPassengers      the number of passengers on board
     * @param jetPlaneNumber         the number of the JetPlane
     */
    public JetPlane(int onBoardPassengers, int jetPlaneNumber) {
        super(onBoardPassengers);
        this.jetPlaneNumber = jetPlaneNumber;
    }

    @Override
    /**
     * Prints out a message saying that the JetPlane is departing from a certain location.
     *
     * @param here              the place from where the JetPlane is departing
     */
    public void departing(String here) {
        System.out.println("The JetPlane " + jetPlaneNumber + " is taking off from " + here + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the JetPlane is arriving to destination.
     *
     * @param destination       the destination of the journey
     */
    public void arriving(String destination) {
        System.out.println("The JetPlane " + jetPlaneNumber + " is landing in " + destination + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the JetPlane has been refuelled with the specified quantity and type of fuel.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The JetPlane has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
