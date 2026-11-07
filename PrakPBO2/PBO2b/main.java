package PrakPBO2.PBO2b;

public class main {

    public static void main(String[] args) { Televisi
            tvFlat=new Televisi("Sharp","3Juta");
        tvFlat.informasiTv();
        tvFlat.hidupkanTv();
        tvFlat.setChannel(1);
        System.out.println("Televisi diset pada channel:"+tvFlat.getChannel());
        tvFlat.matikanTv();
    }

}