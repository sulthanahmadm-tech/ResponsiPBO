package PrakPBO5.PBO5a;

public class main {
    public static void main(String[] args) {
        televisi tvku= new televisi("Sharp");
        tvku.hidupkan(true);
        tvku.keraskanVolume(10);
        tvku.pelankanVolume(3);
        tvku.pindahChannel(5);
        tvku.hidupkan(false);
    }
}