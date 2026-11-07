package ResponsiPrakPBO;

public abstract class mobil {
    public static final String NAMA_BENGKEL = "Utaa Speed Shop";
    private final String nomorSasis;

    private String merk;
    private int tenagaMesin;
    private String kondisiMesin;

    public mobil(String nomorSasis, String merk) {
        this.nomorSasis = nomorSasis;
        this.merk = merk;
        this.tenagaMesin = 200;
        this.kondisiMesin = "Standar";
    }

    public mobil(String nomorSasis, String merk, int tenagaMesin) {
        this.nomorSasis = nomorSasis;
        this.merk = merk;
        this.tenagaMesin = tenagaMesin;
        this.kondisiMesin = "Dimodifikasi";
    }

    public abstract void tuningECU(String profilTuning);

    public void cekStatus() {
        System.out.println("=== Status Mobil ===");
        System.out.println("Sasis : " + this.nomorSasis);
        System.out.println("Merk  : " + this.merk);
        System.out.println("Tenaga: " + this.tenagaMesin + " HP");
        System.out.println("Mesin : " + this.kondisiMesin);
    }

    public String getNomorSasis() {
        return this.nomorSasis;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTenagaMesin() {
        return this.tenagaMesin;
    }

    public void setTenagaMesin(int tenagaMesin) {
        this.tenagaMesin = tenagaMesin;
    }

    public String getKondisiMesin() {
        return this.kondisiMesin;
    }

    public void setKondisiMesin(String kondisiMesin) {
        this.kondisiMesin = kondisiMesin;
    }
}