package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonaTest {
    @Test
    void compareToTestPersona() {
        Persona p =new Persona();
        Persona p2 =new Persona();
        assertEquals(0, p.compareTo(p2));
    }
}
