public class CheckingAccount extends Account{
    public CheckingAccount(){
        super();
    }

    @Override
    void displayInfo() {
        System.out.print("Balance: "+getBalance()
                + "Account Number: "+ getAccountNumber());
    }

}
