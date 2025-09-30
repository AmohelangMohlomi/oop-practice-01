import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    @Test void testDisplayInfo() {
        Account acc = new SavingsAccount("SAV001");
        acc.deposit(2_50);
        assertDoesNotThrow(acc::displayInfo); }
}
