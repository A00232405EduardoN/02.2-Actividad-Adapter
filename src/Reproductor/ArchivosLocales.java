package Reproductor;
import java.util.List;
import java.util.ArrayList;

// Implementación para archivos locales
public class ArchivosLocales {
    private List<Cancion> canciones;

    public ArchivosLocales() {
        // Simulamos algunas canciones locales
        canciones = new ArrayList<>();
        canciones.add(new Cancion("El Sinaloense", "Valentin Elizalde"));
        canciones.add(new Cancion("La Buena y la Mala", "Banda Tierra Sagrada"));
    }

    public void reproducir() {
        System.out.println("Reproduciendo desde archivo local...");
        for (Cancion cancion : canciones) {
            System.out.println("Reproduciendo " +  cancion);
        }
    }

    public void detener() {
        System.out.println("Deteniendo archivo local.");
    }
}
