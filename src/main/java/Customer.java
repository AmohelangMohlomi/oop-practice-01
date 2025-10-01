import java.util.ArrayList;

public class Customer {


    public String name;
    public String customerId;
    public ArrayList<Account> accounts;

    public Customer(String name, String customerId ){
        this.name=name;
        this.customerId=customerId;
        this.accounts= new ArrayList<>();
    }
    public Customer(String name ){
        this.name=name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}
