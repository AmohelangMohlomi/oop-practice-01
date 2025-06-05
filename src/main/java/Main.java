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

        BankingService service = new BankingService();
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Customer customer = new Customer(name);

        boolean shouldContinue = true;
        do{
            System.out.println("Pick a service: ");
            int choice = input.nextInt();

            switch(choice){
                case 0:
                    service.createCustomer(name);
                    System.out.println("Customer successfully created.");
//                    shouldContinue = true;

                case 1:
                    String extra = input.nextLine();
                    System.out.println("Enter Account Type(Checking/Savings): ");
                    String accType = input.nextLine();
                    service.createAccount(customer.getCustomerId(), accType);
                    System.out.println("Account successfully created.");
                    shouldContinue = true;

//                case 6:
//                    input.close();
//                    shouldContinue = false;
//                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }



        }while (shouldContinue== true);



    }

    public static void manageServices(int choice) {


        switch (choice) {
            case 0:

//            case 1:
//                System.out.println("Enter type of Account(Checking/Savings: ");
//                Scanner typeInput = new Scanner(System.in);
//                String type = typeInput.nextLine();
//                if (type == "Checking") {
//                    Account checkAcc = new CheckingAccount();
////                    service.createAccount(customer.getCustomerId(), checkAcc);
//                } else if (type == "Savings") {
//                    Account savingsAcc = new SavingsAccount();
////                    service.createAccount(customer.getCustomerId(), savingsAcc);
//                }
//                typeInput.close();
//                System.out.println("Account successfully created");
////            case 5:
////                BankingService.printCustomerAccounts(customer.getCustomerId());
            case 6:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

    }
}
