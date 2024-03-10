import org.example.exercice03.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    void testFibonacciForZeroShouldReturn0() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(0);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testFibonacciForOneShouldReturn1() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(1);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFibonacciForPositiveNumber() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(7);

        // Assert
        assertEquals(13, result);
    }

    @Test
    void testFibonacciForNegativeNumberShouldThrowException() {
        // Assert & Act
        assertThrows(IllegalArgumentException.class, () -> {Fibonacci.fibonacci(-1);});
    }
}