package Reproductor;
// Clase para representar los atributos de una canción
public class Cancion {
    private String nombre;
    private String artista;

    // Constructor para inicializar la canción
    public Cancion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion: " + nombre + " de " + artista;
    }
}

