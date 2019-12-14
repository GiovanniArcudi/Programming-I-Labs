/**
 * This program defines a Train, extending the {@link Transport} superclass and implementing the {@link Refuelable} interface.
 * Every JetPlane, apart from the properties and methods inherited from {@link Transport} has a {@code jetPlaneNumber}.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class JetPlane extends Transport implements Refuelable{
    private int jetPlaneNumber;        // The number of the JetPlane.

    /**
     * This is the {@link JetPlane} class constructor.
     * It takes two ints and sets them as {@code onBoardPassengers} and {@code jetPlaneNumber}.
     *
     * @param onBoardPassengers      the number of passengers on board
     * @param jetPlaneNumber         the number of the JetPlane
     */
    public JetPlane(int onBoardPassengers, int jetPlaneNumber) {
        super(onBoardPassengers);
        this.jetPlaneNumber = jetPlaneNumber;
    }


    /**
     * Prints out a message saying that the {@link JetPlane} is departing from the location passed as parameter.
     *
     * @param here              the place from where the JetPlane is departing
     */
    @Override
    public void departing(String here) {
        System.out.println("The JetPlane " + jetPlaneNumber + " is taking off from " + here + " in time.");
    }

   
    /**
     * Prints out a message saying that the JetPlane is arriving to the destination passed as parameter.
     *
     * @param destination       the destination of the journey
     */
    @Override
    public void arriving(String destination) {
        System.out.println("The JetPlane " + jetPlaneNumber + " is landing in " + destination + " in time.");
    }

    /**
     * Prints out a message saying that the {@link JetPlane} has been refuelled with the specified {@code litres} of {@code typeOfFuel}.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */
    @Override
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The JetPlane has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
