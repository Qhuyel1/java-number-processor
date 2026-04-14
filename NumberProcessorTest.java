import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    // ===== STATEMENT COVERAGE =====
    @Test
    void testProcessNumbers() {
        int[] arr = {1, -2, 3};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(4, result); // 1 + 3
    }

    @Test
    void testEven() {
        assertEquals("Even", NumberProcessor.checkEvenOdd(2));
    }

    @Test
    void testOdd() {
        assertEquals("Odd", NumberProcessor.checkEvenOdd(3));
    }
}