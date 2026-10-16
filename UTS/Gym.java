package UTS;

public class Gym {
    private String nama;
    private final Loker[] daftarLoker;
    private Manajer manajer;

    public Gym(String nama, int jumlahLoker) {
        if (jumlahLoker < 1) {
            throw new IllegalArgumentException(
                "Jumlah loker minimal 1"
            );
        }

        this.nama = nama;
        this.daftarLoker = new Loker[jumlahLoker];

        for (int i = 0; i < jumlahLoker; i++) {
            daftarLoker[i] = new Loker(i + 1);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    private boolean sudahPunyaLoker(Membership m) {
        for (Loker loker : daftarLoker) {
            if (!loker.isKosong()
                    && loker.getPemakai() == m) {
                return true;
            }
        }

        return false;
    }

    public boolean sewaLoker(Membership m) {
        if (m == null || sudahPunyaLoker(m)) {
            return false;
        }

        for (Loker loker : daftarLoker) {
            if (loker.isKosong()) {
                return loker.sewa(m);
            }
        }

        return false;
    }

    public boolean sewaLoker(Membership m, int nomor) {
        if (m == null
                || nomor < 1
                || nomor > daftarLoker.length
                || sudahPunyaLoker(m)) {
            return false;
        }

        return daftarLoker[nomor - 1].sewa(m);
    }

    public void tampilInfo() {
        String namaManajer = manajer == null
                ? "-"
                : manajer.getNama();

        System.out.println(
            "Gym " + nama
            + " (manajer: " + namaManajer + ")"
        );

        StringBuilder hasil = new StringBuilder();

        for (Loker loker : daftarLoker) {
            if (!loker.isKosong()) {
                if (hasil.length() > 0) {
                    hasil.append(" | ");
                }

                hasil.append("Loker ")
                     .append(loker.getNomor())
                     .append(": ")
                     .append(loker.getPemakai().getNamaMember());
            }
        }

        if (hasil.length() > 0) {
            System.out.println(hasil);
        }
    }
}