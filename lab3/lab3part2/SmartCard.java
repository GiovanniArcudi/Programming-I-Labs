/**
* Every {@link SmartCard} has a string containing the owner's name and a boolean inticating whether it is a staff SmartCard.
* A newly created SmartCard is, by default, a student card.
*
* @author Giovanni Arcudi
* @version 2.0
*/
public class SmartCard {
    String ownerName;
    boolean staff = false;

    /**
     * This is the {@link SmartCard} class constructor.
     * It takes a String parameter to set the owner of the card.
     */
    public SmartCard(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Returns the {@code ownerName} of the SmartCard.
     *
     * @return the owner of the SmartCard
     */
    public String getOwner() {
        return ownerName;
    }

    /**
     * Sets the staff status of the {@link SmartCard} depending on the boolean value received as a parameter.
     */
    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    /**
     * Returns whether the {@link SmartCard} belongs to a member of staff.
     *
     * @return true if the SmartCard belongs to a member of the staff, false otherwise
     */
    public boolean isStaff() {
        return staff;
    }

    /**
     * Creates a new {@link SmartCard}.
     */
    public static void main(String[] args) {
        SmartCard mySmartCard = new SmartCard("Giovanni");
    }
}
