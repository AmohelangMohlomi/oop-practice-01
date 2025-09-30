import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingServiceTest {
    private BankingService bankingService;

    @BeforeEach void setUp() {
        bankingService = new BankingService(); }

    @Test void testCreateCustomer() {
        Customer c = bankingService.createCustomer("Alice");
        assertNotNull(c); assertEquals("Alice", c.getName());
    }

    @Test void testCreateAccount() {
        Customer c = bankingService.createCustomer("Bob");
        Account acc = bankingService.createAccount(c.getCustomerId(), "savings");
        assertNotNull(acc);
        assertEquals(0, acc.getBalance());
    }

    @Test void testDepositAndWithdraw() {
        Customer c = bankingService.createCustomer("Carol");
        Account acc = bankingService.createAccount(c.getCustomerId(), "checking");

        bankingService.deposit(c.getCustomerId(), acc.getAccountNumber(), 500);
        assertEquals(500, acc.getBalance());

        bankingService.withdraw(c.getCustomerId(), acc.getAccountNumber(), 200);
        assertEquals(300, acc.getBalance());
    }

    @Test void testTransferBetweenAccounts() {

        Customer c1 = bankingService.createCustomer("Dave");
        Customer c2 = bankingService.createCustomer("Eve");

        Account acc1 = bankingService.createAccount(c1.getCustomerId(), "checking");
        Account acc2 = bankingService.createAccount(c2.getCustomerId(), "savings");

        bankingService.deposit(c1.getCustomerId(), acc1.getAccountNumber(), 1000);
        bankingService.transfer(c1.getCustomerId(), acc1.getAccountNumber(), c2.getCustomerId(), acc2.getAccountNumber(), 400);

        assertEquals(600, acc1.getBalance());
        assertEquals(400, acc2.getBalance());
    }

}
