/**
 * This program simulates an {@link ATM}. After asking the user to enter the {@code balance} that they would like in their account,
 * it allows them to {@link #withdraw()} or {@link #deposit()} an amount, {@link #inquire()} about the {@code balance},
 * or {@link #quit()} the {@link ATM}.
 * In this version of the program the {@link ATM} works continuously, prompting the user for what they would like to do next.
 *
 * @author Giovanni Arcudi
 * @version 3.0
 */
public class ATM {
    Toolbox myToolbox = new Toolbox();
    int balance;

    /**
     * Creates an {@link ATM} object and then calls {@link #go()}.
     */
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    /**
     * Prompts the user to enter the balance that they would like in their account (negative starting balances are not allowed).
     * Then it shows the menu with all the operations that the user can do.
     * */
    public void go() {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        balance = myToolbox.readIntegerFromCmd();

        // Allows the user another attempt until they provide a valid input.
        while (balance < 0) {
            System.out.println("How much do you want in your account?");
            balance = myToolbox.readIntegerFromCmd();
        }

        while (balance >= 0) {
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
    }

    /**
     * Prompts the user to enter the amount that they would like to {@link #withdraw()} form their account (negative withdrawals 
     * not accepted). Once entered the amount, the withdrawal is performed and the new account {@code balance} is showed.
     */
    public void withdraw() {
        System.out.println("*****************************************");
        System.out.println("              Withdrawal");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");

        int withdrawal = myToolbox.readIntegerFromCmd();

        /* The program doesn't perform negative withdrawals and doesn't allow the {@code balance} to drop to a negative number,
        but allows the user another attempt until they provide a valid input. */
        while (withdrawal < 0 || withdrawal > balance) {
            System.out.println("How much would you like to withdraw?");
            withdrawal = myToolbox.readIntegerFromCmd();
        }

        balance = balance - withdrawal;

        System.out.println("*****************************************");
        System.out.println("Your new balance is " + balance);
        System.out.println("*****************************************");
    }

    /**
     * Prompts the user to enter the amount that they would like to {@link #deposit()} in their account (negative deposits
     * are not accpted). Once entered the amount, the deposit is performed and the new account {@code balance} is showed.
     *  */
    public void deposit() {
        System.out.println("*****************************************");
        System.out.println("                Deposit");
        System.out.println("*****************************************");
        System.out.println("How much would you like to deposit?");

        int deposit = myToolbox.readIntegerFromCmd();

        // Allows the user another attempt until they provide a valid input.
        while (deposit < 0) {
            System.out.println("How much would you like to deposit?");
            deposit = myToolbox.readIntegerFromCmd();
        }

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
        System.exit(0);
    }
}
