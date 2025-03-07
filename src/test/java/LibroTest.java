import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para testear la clase Libro.
 * @see Libro
 * @author Paula Arroyo Ajenjo (aka Polita86@github.com)
 * @version 7.03.2025
 */

class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("La historia interminable","Mikel Ende", 1986);
    }

    @Test
    void getTitulo() {
        assertEquals("La historia interminable", libro.getTitulo(), "El título debe ser -La historia interminable-");

    }

}