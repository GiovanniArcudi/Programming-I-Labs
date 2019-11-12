/**
 * This program creates a SmartCard. Every SmartCard has a string containing the owner's name and a boolean inticating
 * whether it is a staff SmartCard.
 * A newly created SmartCard is, by default, a student card.
 *
 * @author Giovanni Arcudi
 */
public class SmartCard {
    String ownerName;
    boolean staff = false;

    /**
     * This is the SmartCard class constructor.
     * It takes a String parameter to set the owner of the card.
     */
    public SmartCard(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * When the method getOwner() is called, it returns the owner of the SmartCard.
     */
    public String getOwner() {
        return ownerName;
    }

    /**
     * When the method setStaff(boolean staff) is called, it sets the staff status of the SmartCard to what it has
     * received as a parameter.
     */
    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    /**
     * When  the method isStaff() is called, it returns whether the card belongs to a member of staff.
     */
    public boolean isStaff() {
        return staff;
    }

    /**
     * It creates a new SmartCard.
     */
    public static void main(String[] args) {
        SmartCard mySmartCard = new SmartCard("Giovanni");
    }
}
