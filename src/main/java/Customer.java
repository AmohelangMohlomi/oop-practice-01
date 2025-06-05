import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String customerId;
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List getAccounts(){
        return this.accounts;
    }

    public String getName(){
        return this.name;
    }

    public String getCustomerId() {
        return this.customerId;
    }
}
