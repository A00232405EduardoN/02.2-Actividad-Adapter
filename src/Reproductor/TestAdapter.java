package Reproductor;
// Clase para probar la integracion de las diferentes fuentes de música
public class TestAdapter {
    public static void main(String[] args) {
        // Crear instancias de las plataformas
        ArchivosLocales archivoLocal = new ArchivosLocales();
        Spotify spotify = new Spotify();
        GoogleDrive googleDrive = new GoogleDrive();

        // Crear los adaptadores para cada plataforma
        ReproduccionMusica reproductorLocal = new AdapterArchivosLocales(archivoLocal);
        ReproduccionMusica reproductorSpotify = new AdapterSpotify(spotify);
        ReproduccionMusica reproductorGoogleDrive = new AdapterGoogleDrive(googleDrive);

        // Reproducir canciones de una plataforma a la vez (secuencial)
        System.out.println("Lista de reproducción:");

        // Reproducir canciones desde archivo local
        reproductorLocal.reproducir();  // Reproduce desde archivo local
        reproductorLocal.detener();     // Detenemos después de reproducir

        // Reproducir canciones desde Spotify
        reproductorSpotify.reproducir();      // Reproduce desde Spotify
        reproductorSpotify.detener();         // Detenemos después de reproducir

        // Reproducir canciones desde Google Drive
        reproductorGoogleDrive.reproducir();  // Reproduce desde Google Drive
        reproductorGoogleDrive.detener();     // Detenemos después de reproducir
    }
}
