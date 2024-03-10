import org.example.exercice05.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testFactorialForZeroShouldReturn1() {
        // Arrange & Act
        int result = Factorial.factorial(0);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFactorialForPositiveNumber() {
        // Arrange & Act
        int result = Factorial.factorial(6);

        // Assert
        assertEquals(720, result);
    }

    @Test
    void testFactorialForNegativeNumberShouldThrowException() {
        // Assert & Act
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}