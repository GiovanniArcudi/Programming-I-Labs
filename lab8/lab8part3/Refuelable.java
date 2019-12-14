/**
 * This program defines the Refuelable Interface, wich contains the {@link #refuel()} method.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public interface Refuelable {

    /**
     * It refuels the vehicle with the specified amount of litres of fuel.
     *
     * @param litres        the litres of fuel needed
     */
    void refuel(String typeOfFuel, int litres);
}
