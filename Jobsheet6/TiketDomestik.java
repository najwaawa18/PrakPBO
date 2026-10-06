package Jobsheet6;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    // Konstruktor tanpa parameter
    public TiketDomestik() {
        super();
    }

    // Konstruktor berparameter
    public TiketDomestik(String kodeTiket, String namaPenumpang,
                         String asal, String tujuan, int hargaDasar,
                         String maskapai, int beratBagasi,
                         int pajakBandara) {

        super(kodeTiket, namaPenumpang, asal, tujuan,
              hargaDasar, maskapai, beratBagasi);

        this.pajakBandara = pajakBandara;
    }

    // Menampilkan data tiket domestik
    public void tampilDomestik() {
        super.tampilPesawat();

        System.out.println("Pajak Bandara  = " + pajakBandara);
        System.out.println("Total Bayar    = "
                + (getHargaDasar() + hitungBiayaBagasi() + pajakBandara));
    }
}
