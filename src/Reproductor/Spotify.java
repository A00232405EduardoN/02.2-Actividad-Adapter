package Reproductor;
import java.util.List;
import java.util.ArrayList;

// Implementación para Spotify
public class Spotify {
    private List<Cancion> canciones;

    public Spotify() {
        // Simulamos algunas canciones de Spotify
        canciones = new ArrayList<>();
        canciones.add(new Cancion("El Triste", "Jose Jose"));
        canciones.add(new Cancion("Suave", "Luis Miguel"));
    }

    public void reproducir() {
        System.out.println("Reproduciendo desde Spotify...");
        for (Cancion cancion : canciones) {
            System.out.println("Reproduciendo " +  cancion);
        }
    }

    public void detener() {
        System.out.println("Deteniendo Spotify.");
    }
}
