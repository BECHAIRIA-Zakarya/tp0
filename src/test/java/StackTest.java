import org.example.exercice02.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testPushAndPopShouldReturnEtatDuStack() {
        // Arrange
        Stack stack = new Stack();

        // Act
        stack.push(8);
        stack.push(10);
        int popped1 = stack.pop();
        int popped2 = stack.pop();

        // Assert
        assertEquals(10, popped1);
        assertEquals(8, popped2);
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeekShouldReturnEtatDuStack() {
        // Arrange
        Stack stack = new Stack();
        stack.push(8);
        stack.push(10);

        // Act
        int peeked = stack.peek();

        // Assert
        assertEquals(10, peeked);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testIsEmptyShouldReturnEtatDuStack() {
        // Arrange
        Stack stack = new Stack();

        // Act & Assert
        assertTrue(stack.isEmpty());

        stack.push(7);

        assertFalse(stack.isEmpty());

        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testSizeShouldReturnEtatDuStack() {
        // Arrange
        Stack stack = new Stack();

        // Act & Assert
        assertEquals(0, stack.size());

        stack.push(8);
        stack.push(10);

        assertEquals(2, stack.size());

        stack.pop();

        assertEquals(1, stack.size());

        stack.push(15);

        assertEquals(2, stack.size());
    }

    @Test
    void testPopOnEmptyStackShouldThrowException() {
        // Arrange
        Stack stack = new Stack();

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> {stack.pop();});
    }

    @Test
    void testPeekOnEmptyStackShouldThrowException() {
        // Arrange
        Stack stack = new Stack();

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> {stack.peek();});
    }
}