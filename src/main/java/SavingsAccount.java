public class SavingsAccount extends Account{


    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    void displayInfo() {
        System.out.println("Savings Account: " + accountNumber + ", Balance: " + balance);
    }
}
