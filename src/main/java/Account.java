public abstract class Account {

    protected String accountNumber;
    protected int balance =0; // in cents


    public Account(){

    }
    public Account(String customerId, Account type){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    abstract void displayInfo();

    public void deposit(int amountInCents){
        balance += amountInCents;
    }

    public void withdraw(int amountInCents){
        balance -= amountInCents;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }
}
