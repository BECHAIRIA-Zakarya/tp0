import org.example.exercice04.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    void testIsPrimeForZeroShouldReturnFalse() {
        // Arrange & Act
        boolean result = Prime.isPrime(0);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrimeForOneShouldReturnFalse() {
        // Arrange & Act
        boolean result = Prime.isPrime(1);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrimeForPrimeNumberShouldReturnTrue() {
        // Arrange & Act
        boolean result = Prime.isPrime(11);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrimeForCompositeNumberShouldReturnFalse() {
        // Arrange & Act
        boolean result = Prime.isPrime(12);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrimeForNegativeNumberShouldReturnFalse() {
        // Arrange & Act
        boolean result = Prime.isPrime(-3);

        // Assert
        assertFalse(result);
    }
}
