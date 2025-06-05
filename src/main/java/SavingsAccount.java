public class SavingsAccount extends Account {

    @Override
    void displayInfo(){
        System.out.print("Balance: "+getBalance()
                + "Account Number: "+ getAccountNumber());
    }
}
