import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void testDivide() {
        Division div = new Division();
        assertEquals(2, div.divide(10, 5), "10 / 5 should be 2");
    }

    @Test
    public void testDivideByZero() {
        Division div = new Division();
        assertThrows(ArithmeticException.class, () -> div.divide(10, 0));
    }
}
