import java.util.ArrayList;

public class Customer {


    public String name;
    public String customerId;
    public ArrayList<Account> accounts;

    public Customer(String name, String customerId ){
        this.name=name;
        this.customerId=customerId;
    }

    public ArrayList addAccount(Account account){
        accounts.add(account);
        return accounts;
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
