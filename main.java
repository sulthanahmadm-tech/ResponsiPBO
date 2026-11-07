package ResponsiPrakPBO;

public class main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di " + mobil.NAMA_BENGKEL + "!\n");
        System.out.println("-PROJECT: MOBIL DRIFT-");
        mobilDrift rx7 = new mobilDrift("VIN-777", "Mazda RX-7", "Slick Tire");
        rx7.tuningECU("Aggressive");
        rx7.cekStatus();
        System.out.println();

        System.out.println("-PROJECT: MOBIL DRAG-");
        mobilDrag mustang = new mobilDrag("VIN-999", "Ford Mustang", 400);
        mustang.pasangTurbo();
        mustang.tuningECU("Max Power");
        mustang.cekStatus();
        System.out.println();
        sistemNitro mobilBalapLiar = new mobilDrag("VIN-666", "Nissan GTR", 500);
        mobilBalapLiar.injeksiNOS();
    }
}