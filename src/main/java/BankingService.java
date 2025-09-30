public class BankingService {

    public Customer createCustomer(String name){
        return new Customer("","");

    }

    public Account createAccount(String customerId, String type){
        return new CheckingAccount("");
    }

    public void deposit(String customerId, String accountNumber, int amountInCents){

    }

    public void withdraw(String customerId, String accountNumber, int amountInCents){

    }

    public void transfer(String customerIdFrom, String accFrom,String customerIdTo, String accTo, int amountInCents){

    }

    public static void printCustomerAccounts(String customerId) {

    }


}
