package Reproductor;
import java.util.List;
import java.util.ArrayList;

// Implementación para Google Drive
public class GoogleDrive {
    private List<Cancion> canciones;

    public GoogleDrive() {
        // Simulamos algunas canciones en Google Drive
        canciones = new ArrayList<>();
        canciones.add(new Cancion("Cielito lindo", "Mariachi Vargas de Tecalitlan"));
        canciones.add(new Cancion("La Nave del Olvido", "Jose Jose"));
    }

    public void reproducir() {
        System.out.println("Reproduciendo desde Google Drive...");
        for (Cancion cancion : canciones) {
            System.out.println("Reproduciendo " +  cancion);
        }
    }

    public void detener() {
        System.out.println("Deteniendo Google Drive.");
    }
}

