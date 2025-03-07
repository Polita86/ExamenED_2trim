//package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase que representa una biblioteca con una colección de libros
 * Permite agregar, eliminar y  buscar libros por título y por autor
 *
 * @see Libro
 * @author Paula Arroyo Ajenjo (aka Polita86@github.com)
 * @version 7.03.2025
 */

public class Biblioteca {

    /** Lista de los libros disponibles en la biblioteca.*/
    private final List<Libro> libros;

    /** Constructor  por defecto de la clase Biblioteca.
     * Inicializa la lista de libros como una lista vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parámetros de la clase Biblioteca.
     * Inicializa la lista de libros con los libros proporcionados.
     *
     * @param libros Lista de libros con los que se inicializa la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }


    /**
     * Agrega un libro a la biblioteca.
     * @param libro El libro a agregar.
     * @see Libro
     * @return {@code true} si el libro fue agregado correctamente, {@code false} si el libro NO fue agregado correctamente.
     */

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }


    /**
     * Elimina un libro de la biblioteca.
     * @param libro El libro a agregar.
     * @see Libro
     * @return {@code true} si el libro fue eliminado correctamente, {@code false} si el libro NO fue eliminado.
     */

    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de todos los libros en la biblioteca.
     *
     * @return La lista de libros de la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }



    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca un libro por su título en la biblioteca.
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado con el título proporcionado, o null si no existe.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }


    //  No testearlo
    /**
     * @deprecated  --> Metodo obsoleto para encontrar un libro por autor.
     * usar {@link #encuentraLibrosPorAutor(String)} en su lugar.
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado de ese autor, o null si no existe.
     */

    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor en la biblioteca.
     * @since V2.0
     * sustituye al metodo  {@link #encuentaLibroPorAutor(String)} en su lugar.
     * @param autor El autor de los libros a buscar.
     * @return Una lista con los libros encontrados de ese autor. Si no se encuentran libros, se devuelve una lista vacía.
     */
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
