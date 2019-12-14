/**
 * This program defines a Car, extending the {@link RoadVehicle} superclass and implementing the {@link Refuelable} interface.
 * Every Car, apart from the properties and methods inherited from {@RoadVehicle}, has a {@code licensePlateNumber}.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Car extends RoadVehicle implements Refuelable {
    private int licensePlateNumber;     // The car's license plate number.

    /**
     * This is the Car class constructor.
     * It takes two ints and sets them as {@code onBoardPassengers} and {@code licensePlateNumber}.
     *
     * @param onBoardPassengers         the number of passengers on board
     * @param licensePlateNumber        the car's license plate number.
     */
    public Car(int onBoardPassengers, int licensePlateNumber) {
        super(onBoardPassengers);
        this.licensePlateNumber = licensePlateNumber;
    }


    /**
     * Prints out a message saying that the {@link Car} is departing from the location passed as parameter.
     *
     * @param here          the place from where the car is departing
     */    
    @Override
    public void departing(String here) {
        System.out.println("The car with plate number " + licensePlateNumber + " is departing from " + here + " in time.");
    }


    /**
     * Prints out a message saying that the {@link Car} is arriving to the destination passed as parameter.
     *
     * @param destination       the destination of the journey
     */    
    @Override
    public void arriving(String destination) {
        System.out.println("The car with plate number " + licensePlateNumber + " is arriving to " + destination + " in "
                            + "time.");
    }


    /**
     * Prints out a message saying that the {@link Car} has been refuelled with the specified {@code litres} of {@code typeOfFuel}.
     *
     * @param typeOfFuel       the needed type of fuel
     * @param litres           the litres of fuel needed
     */    
    @Override
    public void refuel(String typeOfFuel, int litres) {
        System.out.println("The car has been fully refueled with " + litres + " of " + typeOfFuel);
    }
}
