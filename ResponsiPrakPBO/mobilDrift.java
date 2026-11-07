package ResponsiPrakPBO;
public class mobilDrift extends mobil {

    private String tipeBan;

    public mobilDrift(String nomorSasis, String merk, String tipeBan) {
        super(nomorSasis, merk);
        this.tipeBan = tipeBan;
    }

    @Override
    public void tuningECU(String profilTuning) {
        if (profilTuning.equalsIgnoreCase("Aggressive")) {
            int tenagaBaru = this.getTenagaMesin() + 50;
            this.setTenagaMesin(tenagaBaru);
            this.setKondisiMesin("Overheat Warning - Drift Mode");
            System.out.println("Tuning Aggressive diterapkan! Tenaga naik jadi " + tenagaBaru + " HP.");
        } else {
            int tenagaBaru = this.getTenagaMesin() + 15;
            this.setTenagaMesin(tenagaBaru);
            this.setKondisiMesin("Optimal - Drift Mode");
            System.out.println("Tuning Balance diterapkan! Tenaga naik jadi " + tenagaBaru + " HP.");
        }
    }

    @Override
    public void cekStatus() {
        super.cekStatus();
        System.out.println("Ban   : " + this.tipeBan + " (Khusus Drift)");
    }
}