package Reproductor;
// Adaptador para GoogleDrive
public class AdapterGoogleDrive implements ReproduccionMusica {
    private GoogleDrive GoogleDrive;

    public AdapterGoogleDrive(GoogleDrive GoogleDrive) {
        this.GoogleDrive = GoogleDrive;
    }

    @Override
    public void reproducir() {
        GoogleDrive.reproducir();
    }

    @Override
    public void detener() {
        GoogleDrive.detener();
    }
}