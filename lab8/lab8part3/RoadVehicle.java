/**
 * This program defines a Road Vehicle, and is the abstract superclass of all other road vehicles' classes.
 * It extends the {@link Transport} superclass.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class RoadVehicle extends Transport {

    /**
     * This is the {@link RoadVehicle} class constructor.
     *
     * @param onBoardPassengers         the number of passengers on board
     */
    public RoadVehicle(int onBoardPassengers) {
        super(onBoardPassengers);
    }
}
