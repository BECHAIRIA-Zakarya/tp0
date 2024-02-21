
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        sqa.roman.RomanNumeral roman = new sqa.roman.RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }

}