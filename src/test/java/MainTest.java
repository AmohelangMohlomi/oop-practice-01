
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test void testMainRunsWithoutErrors() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test void testMainHelpOption() {
        // If your CLI supports args like "--help", test it here
        assertDoesNotThrow(() -> Main.main(new String[]{"--help"})); }
}
