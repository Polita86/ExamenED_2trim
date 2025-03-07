//package biblioteca;

/**
 *Clase que representa un libro con su título, autor y año de publicación.
 *
 * @see Biblioteca
 * @author Paula Arroyo Ajenjo (aka Polita86@github.com)
 * @version 7.03.2025
 */

public class Libro {

    /**
     * @param titulo Título del libro.
     */
    private String titulo;

    /**
     * @param autor Autor del libro.
     */
    private String autor;

    /**
     * @param anioPublicacion
     */
    private int anioPublicacion;

    /**
     * Constructor que crea un libro con el título, autor y año de publicación proporcionados.
     * @param titulo Título del libro
     * @param autor Autor del libro.
     * @param anioPublicacion Año en el que el libro fue publicado
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro
     * @return titulo El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro
     * @param titulo El título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que obtiene  el autor del libro
     * @return autor El nuevo autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo que  obtiene el año de publicación del libro.
     * @return anioPublicacion , El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     * @param anioPublicacion El nuevo año de publicación del libro.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
