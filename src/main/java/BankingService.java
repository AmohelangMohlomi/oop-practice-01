import java.util.ArrayList;
import java.util.Random;

public class BankingService {

    Account account;
    ArrayList<Customer> customers= new ArrayList<>();


    public void createCustomer(String name){
        Customer customer = new Customer(name);
        Random random = new Random();
        customer.setCustomerId(name+random.nextInt(100));
    }

    public void createAccount(String customerId, String type){
        Random random = new Random();
        if(type =="Checking"){
            Account checkAcc = new CheckingAccount();
            account.setAccountNumber(customerId + random.nextInt(3) + type);
//            service.createAccount(customer.getCustomerId(), checkAcc);
        } else if (type == "Savings") {
            Account savingsAcc = new SavingsAccount();
            account.setAccountNumber(customerId + random.nextInt(3) + type);
//            service.createAccount(customer.getCustomerId(),savingsAcc);
        }


    }

    public void deposit(String customerId, Account acccountNumber){

    }

    public void withdraw(String customerId, Account accountNumber, int amountInCents){

    }

    public void transfer(String customerIdFrom, Account accFrom,String customerIdTo, Account accTo,int amountInCents){

    }

    public static void printCustomerAccounts(String customerId){

    }


}
