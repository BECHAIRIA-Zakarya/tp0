
import org.example.exercice01.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void getFullNameshouldreturnfirstnamethenlastnameseparatedwithspace() {
        // Arrange
        Person person = new Person("zakarya", "bechairia", 22);
        String firstName = "zakarya";
        String lastName = "bechairia";
        // Act
        String result = person.getFullName();
        // Assert
        assertEquals(firstName + ' ' + lastName, result);
    }
    @Test
    void isAdultshouldreturntruelorsqueageestsuperieurouegale18(){

        //Arrange
            Person person1 = new Person("zakarya","bechairia",22);

         //Act
            boolean result1 = person1.isAdult();
            // Assert
            assertEquals(true, result1);
    }
}
