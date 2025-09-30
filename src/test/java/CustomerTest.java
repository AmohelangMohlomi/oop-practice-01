import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test void testAddAndGetAccounts() {
        Customer customer = new Customer("Alice", "CUST001");
        Account acc = new SavingsAccount("SAV002");
        customer.addAccount(acc);

        List<Account> accounts = customer.getAccounts();
        assertEquals(1, accounts.size());
        assertEquals(acc, accounts.get(0));
    }

    @Test void testGetters() {
        Customer customer = new Customer("Bob", "CUST002");
        assertEquals("Bob", customer.getName());
        assertEquals("CUST002", customer.getCustomerId()); }
}
