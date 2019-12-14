/**
 * This program defines a Bicycle, extending the {@link Cycle} superclass.
 * Every Bicycle, apart from the properties inherited by {@link Cycle}, has a String containing the rider name.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class Bicycle extends Cycle{
    private String riderName;       // The name of the rider.

    /**
     * This is the {@link Bicycle} class constructor.
     * It takes an int and a String as parameters and sets them as {@code onBoardPassengers} and {@code riderName} of the
     * {@link Bicycle} object.
     *
     * @param onBoardPassengers         the number of passengers on board
     * @param riderName                 the name of the rider
     */
    public Bicycle(int onBoardPassengers, String riderName) {
        super(onBoardPassengers);
        this.riderName = riderName;
    }


    /**
     * Prints out a message saying that the {@link Bicycle} is departing from the location passed as parameter.
     *
     * @param here        the place from where the car is departing
     */   
    @Override
    public void departing(String here) {
        System.out.println("The bike ridden by " + riderName + " departing from " + here + " in time.");
    }


    /**
     * Prints out a message saying that the bike is arriving to the destination passed as parameter.
     *
     * @param destination       the destination of the journey
     */    
    @Override
    public void arriving(String destination) {
        System.out.println("The bike ridden by " + riderName + " is arriving to " + destination + " in time.");
    }
}
