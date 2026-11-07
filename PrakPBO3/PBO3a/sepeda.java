package PrakPBO3.PBO3a;
public class sepeda {
    public int pedal;
    public int gear;
    public int kecepatan;
    private int standar;

        public sepeda() {
            }
            public sepeda(int pedal, int gear, int kecepatan){
                this.pedal = pedal;
                this.gear = gear;
                this.kecepatan = kecepatan;
        }
        public void  remsepeda(int nilaiPengereman) {
            kecepatan = kecepatan-nilaiPengereman;
        }
        public void tambahKecepatan(int nilaiTambah) {
         kecepatan = kecepatan+nilaiTambah;
        }
}
