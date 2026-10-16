package UTS;

public class MemberPremium extends Membership {
    private boolean aksesSauna;

    public MemberPremium(
            String kode,
            String namaMember,
            int bulan,
            boolean aksesSauna) {

        super(kode, namaMember, bulan);
        this.aksesSauna = aksesSauna;
    }

    public boolean getAksesSauna() {
        return aksesSauna;
    }

    @Override
    public int hitungIuran() {
        int iuran = 350000 * bulan;

        if (bulan >= 6) {
            iuran = iuran * 80 / 100;
        }

        return iuran;
    }

    @Override
    public String getJenis() {
        return "Premium";
    }
}
