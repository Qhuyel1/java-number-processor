import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    // ===== TEST cho processNumbers (statement coverage) =====
    @Test
    void testProcessNumbers() {
        int[] arr = {1, -2, 3};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(4, result); // 1 + 3
    }

    // ===== TEST cho checkEvenOdd =====
    @Test
    void testEven() {
        assertEquals("Even", NumberProcessor.checkEvenOdd(2));
    }

    @Test
    void testOdd() {
        assertEquals("Odd", NumberProcessor.checkEvenOdd(3));
    }

    // ===== TEST cho path coverage =====
    @Test
    void testAllPositive() {
        int[] arr = {1, 2, 3};
        assertEquals(6, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testAllNegative() {
        int[] arr = {-1, -2, -3};
        assertEquals(0, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testMixed() {
        int[] arr = {-1, 2, -3, 4};
        assertEquals(6, NumberProcessor.processNumbers(arr));
    }
}