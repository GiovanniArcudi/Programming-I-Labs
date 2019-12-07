/**
 * Creates an {@link ATM} object and asks the user to enter the balance that they would like to have in their account.
 *
 * @author Giovanni Arcudi
 * @version 1.0
 */
public class ATM {
    
    Toolbox myToolbox = new Toolbox();

    /**
     * Creates an {@link ATM} object and then calls {@link #go()}.
     */
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    /**
     * Prompts the user to enter the balance that they would like in their account.
     */
    public void go() {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        int balance = myToolbox.readIntegerFromCmd();

        System.out.println(balance);
    }
}
