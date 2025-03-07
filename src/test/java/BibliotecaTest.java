import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de prueba para testear la clase Biblioteca
 * @see Libro
 * @see Biblioteca
 * @author Paula Arroyo Ajenjo (aka Polita86@github.com )
 * @version 7.03.2025
 */
class BibliotecaTest {

    /**Atributo de clase */
    Libro libro;

    /**Inicializamos el atributo biblioteca*/
    Biblioteca biblioteca = new Biblioteca();

    /**Inicializamos el autributo libro*/
    @BeforeEach
    void setUp() {
        libro = new Libro("La historia interminable","Mikel Ende", 1986);
    }


    /**Testeamos el metodo agregarLibro */

    @Test
    void agregarLibro() {
        /** Verificamos que el libro se agrega correctamente a la biblioteca*/
        assertTrue(biblioteca.agregarLibro(libro), "El libro no fue agregado correctamente");

        /**Verificamos si el libro está en la lista */
        assertEquals(1, biblioteca.getLibros().size(), "La cantidad de libros en la biblioteca no es la esperada");
        assertTrue(biblioteca.getLibros().contains(libro), "El libro no se encuentra en la biblioteca");

    }

    /**Testeamos el metodo eliminarLibro */

    @Test
    void eliminarLibro() {
        /** Agregamos el libro para poder eliminarlo */
        biblioteca.agregarLibro(libro);

        /** Verificamos que el libro se puede eliminar correctamente */
        assertTrue(biblioteca.eliminarLibro(libro), "El libro no fue eliminado correctamente");

        /** Verificamos que la lista esté vacía después de eliminar el libro */
        assertEquals(0, biblioteca.getLibros().size(), "La cantidad de libros en la biblioteca no es la esperada");

    }

    /**Testeamos el metodo encuentraLibroPorTitulo*/

    @Test
    void encuentraLibroPorTitulo() {
        /** Agregamos un libro a la biblioteca*/
        biblioteca.agregarLibro(libro);

        /** Probamos que el libro con el título correcto sea encontrado */
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("La historia interminable");
        assertNotNull(encontrado, "El libro con el título dado no fue encontrado");
        assertEquals(libro, encontrado, "El libro encontrado no es el esperado");

        /** Probamos que un libro con un título que no existe retorne null */
        Libro noEncontrado = biblioteca.encuentraLibroPorTitulo("El libro de la selva");
        assertNull(noEncontrado, "Se esperaba que no se encontrara un libro con ese título");

    }


    /**Testeamos el metodo encuentraLibrosPorAutor*/

    @Test
    void encuentraLibrosPorAutor() {

        /** Agregamos varios libros con el mismo autor
         *
         */
        Libro libro2 = new Libro("Momo", "Mikel Ende", 1984);
        Libro libro3 = new Libro("El nunca jamás", "Mikel Ende", 1990);
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        /** Probamos que se devuelvan todos los libros de un autor existente*/
        List<Libro> librosDeAutor = biblioteca.encuentraLibrosPorAutor("Mikel Ende");
    }
}