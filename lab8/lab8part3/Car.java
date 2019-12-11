/**
 * This program defines a Car, extending the RoadVehicle superclass.
 * It also implements the Refuelable interface.
 *
 * @author Giovanni Arcudi
 */
public class Car extends RoadVehicle implements Refuelable {
    private int licensePlateNumber;     // The car's license plate number.

    /**
     * This is the Car class constructor.
     *
     * @param onBoardPassengers         the number of passengers on board
     * @param licensePlateNumber        the car's license plate number.
     */
    public Car(int onBoardPassengers, int licensePlateNumber) {
        super(onBoardPassengers);
        this.licensePlateNumber = licensePlateNumber;
    }

    @Override
    /**
     * Prints out a message saying that the car is departing from a certain location.
     *
     * @param here              the place from where the car is departing
     */
    public void departing(String here) {
        System.out.println("The car with plate number " + licensePlateNumber + " is departing from " + here + " in time.");
    }

    @Override
    /**
     * Prints out a message saying that the car is arriving to destination.
     *
     * @param destination       the destination of the journey
     */
    public void arriving(String destination) {
        System.out.println("The car with plate number " + licensePlateNumber + " is arriving to " + destination + " in "
                            + "time.");
    }

    @Override
    /**
     * Prints out a message saying that the car has been refuelled with the specified quantity and type of fuel.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The car has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
