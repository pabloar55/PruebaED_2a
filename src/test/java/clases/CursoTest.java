package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CursoTest {

    @Test
    void aniadirAlumo() {
        Curso c=new Curso("1ºDAM");
        Persona p=new Persona();
        assertTrue(c.getListaAlumnos().contains(p));
    }

}