import org.example.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PersonTest {
    Person person;

    @Before
    public void setup() {
        person = new Person();

        person.setName("Paul");
        person.setAge(22);
    }

    @Test
    public void testNameLargerThenZero() {
        assertTrue(person.getName().length() > 0);
    }

    @Test
    public void testAgeLargerThenZero() {
        assertTrue(person.getAge() > 0);
    }

    @Test
    public void testSetName() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> person.setName(""));

        assertEquals(RuntimeException.class, exception.getClass());
    }

    @Test
    public void testSetAge() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> person.setAge(-1));

        assertEquals(RuntimeException.class, exception.getClass());
    }
}
