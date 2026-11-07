package PrakPBO4.PBO4c;

public class mesinCuci extends satuMesin {
    public mesinCuci(String Nama) {
        super(Nama);
    }
    public void hidupkanMesin() {
        if(isHidup()){
            System.out.println(getClass()+" sudah didup");
        }
        else {
            setHidup(true);
            System.out.println(getClass()+ " dihidupkan");
        }
    }
    public void matikanMesin(){
        if (isHidup()) {
            setHidup(false);
            System.out.println(getClass()+ " dimatikan");
        }
        else {
            setHidup(true);
            System.out.println(getClass()+ " keadaan mati");
        }
    }
}
