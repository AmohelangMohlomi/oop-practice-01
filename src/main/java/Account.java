public abstract class Account {
    protected String accountNumber;
    protected int balance; // in cents

    abstract void displayInfo();

    public void deposit(int amountInCents){
        balance += amountInCents;
    }

    public void withdraw(int amountInCents){
        balance -= amountInCents;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }
}
