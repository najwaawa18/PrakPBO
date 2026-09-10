package Jobsheet2.Tugas;

public class SewaGame {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaSewa;

    public double hitungHargaBayar() {
        return lamaSewa * hargaSewa;
    }

    public void tampilkanData() {
        System.out.println("ID Member    : " + id);
        System.out.println("Nama Member  : " + namaMember);
        System.out.println("Nama Game    : " + namaGame);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Harga / Hari : Rp " + hargaSewa);
        System.out.println("Total Bayar  : Rp " + hitungHargaBayar());
    }
}
