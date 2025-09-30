public abstract class Account {
    protected String accountNumber;

    protected int balance;

    public Account(String accountNumber){
        this.accountNumber=accountNumber;
    }

    abstract  void displayInfo();

    public void deposit(int amountInCents){

    }

    public void withdraw(int amountInCents){

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


}
