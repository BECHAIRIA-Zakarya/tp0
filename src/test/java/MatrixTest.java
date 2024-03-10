import org.example.exerciceBonus02.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void testSetAndGetShouldReturnValeurDeUneCase() {
        // Arrange
        Matrix matrix = new Matrix(3);

        // Act
        matrix.set(1, 1, 9);

        // Assert
        assertEquals(9, matrix.get(1, 1));
    }

    @Test
    void testAddShouldReturnValeurFinalDuSomme() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        // Act
        matrix1.add(matrix2);

        // Assert
        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    void testMultiplyShouldReturnValeurFinalDuProduit() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        // Act
        matrix1.multiply(matrix2);

        // Assert
        assertEquals(19, matrix1.get(0, 0));
        assertEquals(22, matrix1.get(0, 1));
        assertEquals(43, matrix1.get(1, 0));
        assertEquals(50, matrix1.get(1, 1));
    }

    @Test
    void testTransposeShouldReturnMatriceFinal() {
        // Arrange
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        // Act
        matrix.transpose();

        // Assert
        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void testToStringShouldReturnMatriceSousFormeDuText() {
        // Arrange
        Matrix matrix = new Matrix(3);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(0, 2, 3);
        matrix.set(1, 0, 4);
        matrix.set(1, 1, 5);
        matrix.set(1, 2, 6);
        matrix.set(2, 0, 7);
        matrix.set(2, 1, 8);
        matrix.set(2, 2, 9);

        // Act
        String result = matrix.toString();

        // Assert
        String expected = "[1, 2, 3]\n[4, 5, 6]\n[7, 8, 9]\n";
        assertEquals(expected, result);
    }
}
