import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    @Test void testDepositAndWithdraw() {

        Account acc = new CheckingAccount("CHK123");
        acc.deposit(10_00); // R10
        assertEquals(10_00, acc.getBalance());

        acc.withdraw(5_00);
        assertEquals(5_00, acc.getBalance());
    }

    @Test void testWithdrawMoreThanBalance() {
        Account acc = new CheckingAccount("CHK124");
        acc.deposit(1_00);
        acc.withdraw(2_00);
        assertEquals(1_00, acc.getBalance(), "Balance should remain unchanged if insufficient funds");

    }

}
