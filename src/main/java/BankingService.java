import java.util.ArrayList;
import java.util.Random;

public class BankingService {
    Customer customer;
    Account account;
    ArrayList<Customer> customers= new ArrayList<>();

    public void createCustomer(String name){
        Random random = new Random();
        customer.setCustomerId(name+random.nextInt(100));
    }

    public void createAccount(String customerId, Account type){
        Random random = new Random();
        account.setAccountNumber(customerId + random.nextInt(3) + type);
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
