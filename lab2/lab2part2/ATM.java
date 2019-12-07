/**
 * This program simulates an {@link ATM}. After aking the user to enter the balance that they would like in their account,
 * it allows them to {@link #withdraw()} or {@link #deposit()} an amount, {@link #inquire()} about the 
 * {@code balance}, or {@link #quit()} the {@link ATM}.
 * In this version of the program the ATM can only perform one operation before "turning off".
 *
 * @author Giovanni Arcudi
 * @version 2.0
 */
public class ATM {
    Toolbox myToolbox = new Toolbox();
    int balance;

    /**
     * Creates an {@link ATM} object and then calls a method called {@link #go()}.
     */
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    /**
     * Prompts the user to enter the {@code balance} that they would like in their account.
     * Then it shows the menu with all the operations that the user can do.
     */
    public void go() {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        balance = myToolbox.readIntegerFromCmd();

        System.out.println("What do you want to do?");
        System.out.println("1 : Withdraw");
        System.out.println("2 : Deposit");
        System.out.println("3 : Inquire");
        System.out.println("4 : Quit");

        int operation = myToolbox.readIntegerFromCmd();

        if (operation == 1) {
            withdraw();
        } else if (operation == 2) {
            deposit();
        } else if (operation == 3) {
            inquire();
        } else if (operation == 4) {
            quit();
        }
    }

    /**
     * Prompts the user to enter the amount that they would like to withdraw form their account.
     * Once entered the amount, the withdrawal is performed and the new account balance is showed.
     */
    public void withdraw() {
        System.out.println("*****************************************");
        System.out.println("               Withdrawal");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");

        int withdrawal = myToolbox.readIntegerFromCmd();

        balance = balance - withdrawal;

        System.out.println("*****************************************");
        System.out.println("Your new balance is " + balance);
        System.out.println("*****************************************");
    }

    /**
     * Prompts the user to enter the amount that they would like to deposit in their account.
     * Once entered the amount, the deposit is performed and the new account balance is showed.
     */
    public void deposit() {
        System.out.println("*****************************************");
        System.out.println("                Deposit");
        System.out.println("*****************************************");
        System.out.println("How much would you like to deposit?");

        int deposit = myToolbox.readIntegerFromCmd();

        balance = balance + deposit;

        System.out.println("*****************************************");
        System.out.println("        Your new balance is " + balance);
        System.out.println("*****************************************");
    }

    /**
     * Shows the account {@code balance}.
     */
    public void inquire() {
        System.out.println("*****************************************");
        System.out.println("        Your balance is " + balance);
        System.out.println("*****************************************");
    }

    /**
     * Says goodbye to the customer and quits.
     */
    public void quit() {
        System.out.println("*****************************************");
        System.out.println("                GoodBye!");
        System.out.println("*****************************************");
    }
}
