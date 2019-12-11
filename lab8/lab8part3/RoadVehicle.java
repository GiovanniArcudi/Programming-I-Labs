/**
 * This program defines a Road Vehicle, and is the abstract superclass of all other road vehicles' classes.
 *
 * @author Giovanni Arcudi
 */
public abstract class RoadVehicle extends Transport {

    /**
     * This is the Road Vehicle class constructor.
     *
     * @param onBoardPassengers the number of passengers on board
     */
    public RoadVehicle(int onBoardPassengers) {
        super(onBoardPassengers);
    }
}
