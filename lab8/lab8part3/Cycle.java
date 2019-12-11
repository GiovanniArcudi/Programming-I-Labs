/**
 * This program defines a Cycle, and is the abstract superclass of all other cycles' classes.
 *
 * @author Giovanni Arcudi
 */
public abstract class Cycle extends RoadVehicle {

    /**
     * This is the Cycle class constructor.
     *
     * @param onBoardPassengers the number of passengers on board
     */
    public Cycle(int onBoardPassengers) {
        super(onBoardPassengers);
    }
}
