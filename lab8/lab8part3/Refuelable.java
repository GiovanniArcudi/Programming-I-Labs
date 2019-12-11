/**
 * This program defines the Refuelable interface.
 *
 * @author Giovanni Arcudi
 */
public interface Refuelable {

    /**
     * It refuels the vehicle with the specified amount of litres of fuel.
     *
     * @param litres        the litres of fuel needed
     */
    void refuel(String typeOfFuel, int litres);
}
