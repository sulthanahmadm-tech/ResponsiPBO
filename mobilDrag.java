package ResponsiPrakPBO;

public class mobilDrag extends mobil implements modifikasiTurbo, sistemNitro {

    private boolean turboAktif;

    public mobilDrag(String nomorSasis, String merk, int tenagaMesin) {
        super(nomorSasis, merk, tenagaMesin);
        this.turboAktif = false;
    }

    @Override
    public void tuningECU(String profilTuning) {
        // Syarat 8: Percabangan State
        if (profilTuning.equalsIgnoreCase("Max Power")) {
            this.setTenagaMesin(this.getTenagaMesin() + 150);
            this.setKondisiMesin("Redline - Drag Mode");
        } else {
            this.setTenagaMesin(this.getTenagaMesin() + 40);
            this.setKondisiMesin("Safe - Drag Mode");
        }
    }

    @Override
    public void pasangTurbo() {
        this.turboAktif = true;
        this.setTenagaMesin(this.getTenagaMesin() + 200);
        System.out.println("Twin-Turbo dipasang! Mesin bergetar hebat.");
    }

    @Override
    public void injeksiNOS() {
        if (turboAktif) {
            System.out.println("WUSSSHHH! Nitrous disemprotkan! Mobil melesat dengan Turbo!");
        } else {
            System.out.println("Nitrous disemprotkan! Kecepatan instan meningkat!");
        }
    }
}