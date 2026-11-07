package PrakPBO3.PBO3a;

public class SepedaGunung extends sepeda {
    private int ShockBreaker;
    private  int Lampu;
    private int tempatMinum;

        public int getShockBreaker(){
            return ShockBreaker;
        }
        public int getLampu(){
            return Lampu;
        }
        public int gettempatMinum(){
            return tempatMinum;
        }
        public void setShockBreaker(int ShockBreaker) {
            this.ShockBreaker = ShockBreaker;
        }
        public void setLampu(int lampu) {
            this.Lampu = lampu;
        }
        public void settempatMinum (int tempatMinum) {
            this.tempatMinum = tempatMinum;
        }
}
