package PrakPBO3.PBO3a;

public class Main {
    public static void main (String[] args) {
        SepedaGunung Poligon=new SepedaGunung();
        Poligon.gear=1;
        Poligon.pedal=2;
        Poligon.kecepatan=40;
        Poligon.setLampu(1);
        Poligon.setShockBreaker(2);
        Poligon.settempatMinum(1);
        System.out.println("Jumlah gear:"+Poligon.gear+", Jumlah pedal:"+Poligon.pedal+", Kecepatan:"+Poligon.kecepatan+", Lampu:"+Poligon.getLampu()+", ShockBreaker:"+Poligon.getShockBreaker());
    }
}