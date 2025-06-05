import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> services = new ArrayList<>(Arrays.asList("Create Customer",
                "Create Account", "Deposit", "Withdraw", "Transfer",
                "View Account Info", "Exit"));
        System.out.println("=====Banking Menu=====");
        for (int i = 0; i < services.size(); i++) {
            System.out.println(i + ". " + services.get(i));
        }

        System.out.println("Pick a service: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        System.out.println(choice);

        input.close();


    }

    public void manageServices(int choice, BankingService service, Customer customer) {
        switch (choice) {
            case 0:
                System.out.println("Enter your name: ");
                Scanner input = new Scanner(System.in);
                String name = input.nextLine();
                service.createCustomer(name);
            case 1:
                System.out.println("Enter type of Account(Checking/Savings: ");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.nextLine();
                if (type == "Checking") {
                    Account checkAcc = new CheckingAccount();
                    service.createAccount(customer.getCustomerId(), checkAcc);
                } else if (type == "Savings") {
                    Account savingsAcc = new SavingsAccount();
                    service.createAccount(customer.getCustomerId(), savingsAcc);
                }
            case 5:
                BankingService.printCustomerAccounts(customer.getCustomerId());
            case 6:
                break;
        }

    }
}
