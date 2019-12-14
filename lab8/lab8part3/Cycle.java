/**
 * This program defines a Cycle and is the abstract superclass of all other cycles' classes.
 * It extends the {@link RoadVehicle} superclass.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public abstract class Cycle extends RoadVehicle {

    /**
     * This is the {@link Cycle} class constructor.
     * It takes an int a sparameter and sets it as {@code onBoardPassengers}.
     *
     * @param onBoardPassengers the number of passengers on board
     */
    public Cycle(int onBoardPassengers) {
        super(onBoardPassengers);
    }
}
