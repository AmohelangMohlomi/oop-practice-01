import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckingAccountTest {

    @Test void testDisplayInfo() {
        Account acc = new CheckingAccount("CHK001");
        acc.deposit(1_00);
        assertDoesNotThrow(acc::displayInfo);
    }
}
