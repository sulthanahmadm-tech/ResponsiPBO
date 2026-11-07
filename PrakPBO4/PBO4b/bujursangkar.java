package PrakPBO4.PBO4b;

public class bujursangkar extends bentuk2D {
    private int sisi;
    private int luas;
    private int keliling;

    public bujursangkar(int sisi) {
        this.sisi = sisi;
    }
    public void cetakLuas(){
        luas = sisi*sisi;
        System.out.println("Luas bujur sangkar adalah:" + luas);
    }
    public void cetakKeliling(){
        keliling=4*sisi;
        System.out.println("Keliling bujur sangkar adalah:" + keliling);
    }
}
