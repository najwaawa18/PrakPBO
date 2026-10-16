package UTS;

public class Membership {
    protected String kode;
    protected String namaMember;
    protected int bulan;
    private PersonalTrainer trainer;

    public Membership(String kode, String namaMember, int bulan) {
        this.kode = kode;
        this.namaMember = namaMember;
        this.bulan = bulan;
        this.trainer = null;
    }

    public void setTrainer(PersonalTrainer trainer) {
        this.trainer = trainer;
    }

    public PersonalTrainer getTrainer() {
        return trainer;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public int getBulan() {
        return bulan;
    }

    public void perpanjang() {
        bulan++;
    }

    public void perpanjang(int tambahan) {
        if (tambahan > 0) {
            bulan += tambahan;
        }
    }

    public int hitungIuran() {
        return 0;
    }

    public String getJenis() {
        return "Membership";
    }
}
