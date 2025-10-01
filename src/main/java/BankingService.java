import java.util.ArrayList;

public class BankingService {
    private ArrayList<Customer> customers = new ArrayList<>();
    private int accountCounter = 1;

    public Customer createCustomer(String name) {
        String customerId = "CUST" + (customers.size() + 1);
        Customer customer = new Customer(name, customerId);
        customers.add(customer);
        return customer;
    }

    public Account createAccount(String customerId, String type) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) return null;

        String accNumPrefix = type.equalsIgnoreCase("checking") ? "CH" : "SAV";
        String accountNumber = accNumPrefix + accountCounter++;
        Account account;

        if (type.equalsIgnoreCase("checking")) {
            account = new CheckingAccount(accountNumber);
        } else if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(accountNumber);
        } else {
            return null;
        }

        customer.addAccount(account);
        return account;
    }

    public void deposit(String customerId, String accountNumber, int amountInCents) {
        Account account = findAccount(customerId, accountNumber);
        if (account != null) {
            account.deposit(amountInCents);
        }
    }

    public void withdraw(String customerId, String accountNumber, int amountInCents) {
        Account account = findAccount(customerId, accountNumber);
        if (account != null) {
            account.withdraw(amountInCents);
        }
    }

    public void transfer(String customerIdFrom, String accFrom, String customerIdTo, String accTo, int amountInCents) {
        Account from = findAccount(customerIdFrom, accFrom);
        Account to = findAccount(customerIdTo, accTo);

        if (from != null && to != null && from.getBalance() >= amountInCents) {
            from.withdraw(amountInCents);
            to.deposit(amountInCents);
        }
    }

    public void printCustomerAccounts(String customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            for (Account acc : customer.getAccounts()) {
                acc.displayInfo();
            }
        }
    }

    // Helper methods
    private Customer findCustomerById(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    private Account findAccount(String customerId, String accountNumber) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) return null;

        for (Account acc : customer.getAccounts()) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}
