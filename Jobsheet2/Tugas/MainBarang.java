package Jobsheet2.Tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "BRG01";
        b1.namaBarang = "Headset Gaming";
        b1.hargaDasar = 200000;
        b1.diskon = 0.1f; // Diskon 10%

        b1.tampilData();
    }
}
