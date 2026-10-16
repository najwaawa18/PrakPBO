package UTS;

public class KartuPrinter {
    private String model;

    public KartuPrinter(String model) {
        this.model = model;
    }

    public void cetakKartu(Membership m) {
        if (m == null) {
            System.out.println("Kartu tidak dapat dicetak.");
            return;
        }

        String namaTrainer = "-";

        if (m.getTrainer() != null) {
            namaTrainer = m.getTrainer().getNama();
        }

        System.out.println(
            "Kartu [" + m.getJenis() + "] "
            + m.getKode() + " "
            + m.getNamaMember() + " "
            + m.getBulan() + " bulan"
            + " | Trainer: " + namaTrainer
            + " | Iuran: " + m.hitungIuran()
        );
    }
}
