/**
 * This program creates an ATM object and asks the user to enter the balance thatthey would like in their account.
 *
 * @author Giovanni Arcudi
 */
public class ATM {

    Toolbox myToolbox = new Toolbox();      // Creates a new toolbox.

    /**
     * Creates an ATM object and then calls a method called go().
     */
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    /**
     * When the method go() is called the program prompts the user to enter the balance that they would like in
     * their account.
     */
    public void go() {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        int balance = myToolbox.readIntegerFromCmd();

        System.out.println(balance);
    }
}
