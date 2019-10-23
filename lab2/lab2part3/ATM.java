/**
 * This program simulates an ATM. After asking the user to enter the balance that they would like in their account,
 * it allows them to withdraw or deposit an amount, inquire about the balance, or quit the ATM.
 * In this version of the program the ATM works continuously, prompting the user for what they would like to do next.
 *
 * @author Giovanni Arcudi
 */
public class ATM {
    Toolbox myToolbox = new Toolbox();      // Creates a new toolbox.
    int balance;

    /**
     * Creates an ATM object and then calls a method called go().
     */
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    /**
     * When the method go() is called the program prompts the user to enter the balance that they would like in
     * their account (negative starting balances are not allowed). Then it shows the menu with all the operations
     * that the user can do.
     * */
    public void go() {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");

        balance = myToolbox.readIntegerFromCmd();

        // The program allows the user another attempt until they provide a valid input.
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
     *  When the method withdraw() is called the program prompts the user to enter the amount that they would like to
     *  withdraw form their account (negative withdrawals are not accepted). Once entered the amount, the withdrawal
     *  is performed and the new account balance is showed.
     */
    public void withdraw() {
        System.out.println("*****************************************");
        System.out.println("              Withdrawal");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");

        int withdrawal = myToolbox.readIntegerFromCmd();

        /* The program doesn't perform negative withdrawals and doesn't allow the balance to drop to a negative number,
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
     *  When the method deposit() is called the program prompts the user to enter the amount that they would like to
     *  deposit in their account (negative deposits are not accpted). Once entered the amount, the deposit is performed
     *  and the new account balance is showed.
     *  */
    public void deposit() {
        System.out.println("*****************************************");
        System.out.println("                Deposit");
        System.out.println("*****************************************");
        System.out.println("How much would you like to deposit?");

        int deposit = myToolbox.readIntegerFromCmd();

        //The program allows the user another attempt until they provide a valid input.
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
     * When the method inquire() is called the account balance is showed.
     */
    public void inquire() {
        System.out.println("*****************************************");
        System.out.println("        Your balance is " + balance);
        System.out.println("*****************************************");
    }

    /**
     * When the method quit() is called the ATM says goodbye to the customer and stops working.
     */
    public void quit() {
        System.out.println("*****************************************");
        System.out.println("                GoodBye!");
        System.out.println("*****************************************");

        System.exit(0);
    }
}