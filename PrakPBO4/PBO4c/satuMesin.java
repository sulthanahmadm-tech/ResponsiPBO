package PrakPBO4.PBO4c;

public abstract class satuMesin {
    private boolean hidup;
    private String Nama;
    public abstract void hidupkanMesin();
    public abstract void matikanMesin();

        public satuMesin(String Nama) {
            this.Nama = Nama;
        }
        public boolean isHidup() {
            return hidup;
        }
        public void setHidup(boolean hidup) {
            this.hidup = hidup;
        }
}
