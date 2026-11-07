package PrakPBO6;

public class main {
    public static void main (String[] args) {
        Televisi GoogleTv = new Televisi("Google");
        GoogleTv.hidupkan(true);
        GoogleTv.konekInternet(true);
        GoogleTv.keraskanVolume(10);
        GoogleTv.hidupkan(false);
    }
}