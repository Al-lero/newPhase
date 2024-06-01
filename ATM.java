import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ATM {
    static ArrayList<String[]> accounts = new ArrayList<>();
    private static String newPin;
    private static String pin;

    static Scanner input = new Scanner(System.in);
    private static String[] balance;

    public static void main(String[] args) {

        gotoMainMenu();
    }

    public static void gotoMainMenu() {
        System.out.println("Welcome to Lero's Banking Platform");

        String mainMenu = """
                1-> Register
                2-> Login
                """;

        System.out.println(mainMenu);
        System.out.println("Enter preferred number: ");
        char userInput = input.nextLine().charAt(0);

        switch (userInput) {

            case '1':
                register();
                break;
            case '2':
                login();
                break;
        }
    }

    public static void register() {

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter pin: ");
        String pin = input.nextLine();
        String [] newAccount = new String[]{Arrays.toString(new String[]{firstName, lastName, pin, "0"})};
        accounts.add(newAccount);
        System.out.println("Account opened Successfully");
        gotoMainMenu();

    }

    public static void login() {
        String menu = """
                1-> Deposit
                2-> Withdraw
                3-> Transfer
                4-> Check Balance
                5-> Change Pin
                6-> Log out
                """;

        System.out.println(menu);
        System.out.println("Enter preferred number: ");
        char userInput = input.nextLine().charAt(0);

        switch (userInput) {

            case '1' -> deposit();
            case '2' -> withdraw();
            case '3' -> transfer();
            case '4' -> checkBalance();
            case '5' -> changePin();
            case '6' -> logOut();
            default -> {
                gotoMainMenu();
            }
        }
    }

    private static void withdraw() {
        System.out.println("Enter Account Number: ");
        String accountNumber = input.nextLine();
        System.out.println("Enter amount to withdraw:");
        String amount = input.nextLine();
        System.out.println("Enter your pin to confirm withdrawing: ");
        String pin = input.nextLine();
        if (pin == pin) {
            String[] customerAccount = accounts.get(Integer.parseInt(accountNumber) - 1);
            customerAccount[3] = (Integer.parseInt(customerAccount[3])) - (Integer.parseInt(amount)) + "";
            System.out.printf("Your withdraw of %d is successful, Your balance is %d%n", Integer.parseInt(amount), Integer.parseInt(customerAccount[3]));
            accounts.add(customerAccount);
        } else {
            System.out.println("Wrong Pin");

        }
        login();

    }
}

public static void deposit() {
    System.out.println("Enter Account Number: ");
    String accountNumber = input.nextLine();
    System.out.println("Enter amount to deposit: ");
    String amount = input.nextLine();
    String[] customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumber) - 1);
    customerAccount[3] = (Integer.parseInt(customerAccount[3])) + (Integer.parseInt(amount)) + "";
    System.out.printf("Your withdraw of %d is successful, Your balance is %d%n", Integer.parseInt(amount), Integer.parseInt(customerAccount[3]));
    Accounts.accounts.add(customerAccount);
    Accounts.login();
}

private static void logOut() {
    System.out.println("Enter Account Number: ");
    String accountNumber = input.next();
    String[] customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumber) - 1);

    System.out.println("Account Log out sucessful.");

}

private static void changePin() {
    System.out.println("Enter Account Number: ");
    String accountNumber = input.nextLine();
    String[] customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumber) - 1);

    System.out.println("Enter old pin: ");
    String pin = input.nextLine();

    //String newAccount = null;
    if (newAccount[2] == pin) {
        System.out.println("Enter New pin: ");
        String newPin = input.nextLine();
        newAccount[2] = newPin;

        System.out.println("Pin successfully Changed");
        Accounts.gotoMainMenu();
    } else {
        System.out.println("No pin Found");
    }

}

private static void checkBalance() {
    System.out.println("Enter Account Number: ");
    String accountNumber;
    accountNumber = input.nextLine();
    System.out.println("Enter Pin to check Balance: ");
    String pin = input.nextLine();
    if (pin == pin) {
        String[] customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumber) - 1);

        System.out.printf("Your balance is %d%n:", new Object[]{Integer.parseInt(customerAccount[3])});
        Accounts.accounts.add(customerAccount);
    } else {
        System.out.println("Wrong Pin");
    }
    Accounts.login();
}

private static void transfer() {
    System.out.println("Enter Account number to transfer from: ");
    String accountNumberFrom = input.nextLine();
    String[] customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumberFrom)-1);
    System.out.println("Enter your pin to confirm transfer:");
    String pin = input.nextLine();
    if(pin == pin){
        System.out.println("Enter account number to transfer to: ");
        String accountNumberTo = input.nextLine();
        customerAccount = Accounts.accounts.get(Integer.parseInt(accountNumberTo) + 1);
        System.out.println("Enter Amount: ");
        String amount = input.nextLine();
        if(Integer.parseInt(Arrays.toString(Accounts.balance)) <= Integer.parseInt(amount)){
            customerAccount = new String[]{"%d".formatted((Integer.parseInt(Arrays.toString(new String[][]{new String[]{Arrays.toString(customerAccount)}}))) - (Integer.parseInt(amount)))};
            System.out.printf("Transfer is successful. Your balance is %d%n", Integer.parseInt(amount), Integer.parseInt(Arrays.toString(new String[][]{new String[]{Arrays.toString(customerAccount)}})));
            Accounts.accounts.add(Accounts.balance);
            Accounts.login();

        }
        else {
            System.out.println("Wrong pin");
        }

        System.out.println("Insfficent amount");
    }
    Accounts.gotoMainMenu();
}




private static Scanner input;

public void main() {
}

private static String[] newAccount;