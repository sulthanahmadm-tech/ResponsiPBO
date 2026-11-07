package PrakPBO2.PBO2b;

public class Televisi {
    private String merk;
    private String harga;
    private int channel;

    public Televisi(String merk, String harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Televisi " + merk + " seharga " + harga);
    }

    public void hidupkanTv() {
        System.out.println("Televisi hidup");
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    public void matikanTv() {
        System.out.println("Televisi mati");
    }
}