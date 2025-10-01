public class CheckingAccount extends Account {


    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    void displayInfo() {
        System.out.println("Checking Account: " + accountNumber + ", Balance: " + balance);

    }
}
