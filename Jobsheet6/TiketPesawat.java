package Jobsheet6;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    // Konstruktor tanpa parameter
    public TiketPesawat() {
        super();
    }

    // Konstruktor berparameter
    public TiketPesawat(String kodeTiket, String namaPenumpang,
                        String asal, String tujuan, int hargaDasar,
                        String maskapai, int beratBagasi) {

        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);

        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    // Menghitung biaya bagasi
    public int hitungBiayaBagasi() {
        if (beratBagasi <= 20) {
            return 0;
        }

        return (beratBagasi - 20) * 50000;
    }

    // Menampilkan data pesawat
    public void tampilPesawat() {
        super.tampilTiket();

        System.out.println("Maskapai       = " + maskapai);
        System.out.println("Berat Bagasi   = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi   = " + hitungBiayaBagasi());
    }
}