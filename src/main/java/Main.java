import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static List<String> services = Arrays.asList(
            "Create Customer",
            "Create Account",
            "Deposit",
            "Withdraw",
            "Transfer",
            "View Account Info",
            "Exit"
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingService bankingService = new BankingService();

        while (true) {
            System.out.println("\n===== Banking Menu =====");

            for (int i = 0; i < services.size(); i++) {
                System.out.println((i + 1) + ". " + services.get(i));
            }

            System.out.print("Choose an option (1-" + services.size() + "): ");
            int choice;


            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (choice < 1 || choice > services.size()) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }


            if (choice == services.size()) {
                System.out.println("Exiting... Goodbye!");
                break;
            }


            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    Customer customer = bankingService.createCustomer(name);
                    System.out.println("Created customer with ID: " + customer.getCustomerId());
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter account type (checking/savings): ");
                    String type = scanner.nextLine();
                    Account acc = bankingService.createAccount(customerId, type);
                    if (acc != null) {
                        System.out.println("Created account: " + acc.getAccountNumber());
                    } else {
                        System.out.println("Could not create account.");
                    }
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter amount (in cents): ");
                    int depositAmount = Integer.parseInt(scanner.nextLine());
                    bankingService.deposit(customerId, accNum, depositAmount);
                    System.out.println("Deposit successful.");
                    break;

                case 4:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    System.out.print("Enter amount (in cents): ");
                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
                    bankingService.withdraw(customerId, accNum, withdrawAmount);
                    System.out.println("Withdraw successful.");
                    break;

                case 5:
                    System.out.print("Enter FROM customer ID: ");
                    String fromId = scanner.nextLine();
                    System.out.print("Enter FROM account number: ");
                    String fromAcc = scanner.nextLine();
                    System.out.print("Enter TO customer ID: ");
                    String toId = scanner.nextLine();
                    System.out.print("Enter TO account number: ");
                    String toAcc = scanner.nextLine();
                    System.out.print("Enter amount (in cents): ");
                    int transferAmount = Integer.parseInt(scanner.nextLine());
                    bankingService.transfer(fromId, fromAcc, toId, toAcc, transferAmount);
                    System.out.println("Transfer complete.");
                    break;

                case 6:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    bankingService.printCustomerAccounts(customerId);
                    break;

                default:
                    System.out.println("Unknown option. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}
