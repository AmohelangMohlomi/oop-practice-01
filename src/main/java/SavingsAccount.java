public class SavingsAccount extends Account {
    public SavingsAccount(){
        super();
    }

    @Override
    void displayInfo(){
        System.out.print("Balance: "+getBalance()
                + "Account Number: "+ getAccountNumber());
    }
}
