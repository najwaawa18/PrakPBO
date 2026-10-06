package Jobsheet6;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    // Konstruktor tanpa parameter
    public TiketInternasional() {
        super();
    }

    // Konstruktor berparameter
    public TiketInternasional(String kodeTiket, String namaPenumpang,
                              String asal, String tujuan, int hargaDasar,
                              String maskapai, int beratBagasi,
                              String nomorPaspor, int asuransi) {

        super(kodeTiket, namaPenumpang, asal, tujuan,
              hargaDasar, maskapai, beratBagasi);

        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    // Menampilkan data tiket internasional
    public void tampilInternasional() {
        super.tampilPesawat();

        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + asuransi);
        System.out.println("Total Bayar    = "
                + (getHargaDasar() + hitungBiayaBagasi() + asuransi));
    }
}
