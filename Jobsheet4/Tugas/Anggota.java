// CLASS: Anggota
// Menggunakan Buku hanya sebagai parameter method -> DEPENDENCY
public class Anggota {
    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    // ---- DEPENDENCY (Anggota ..> Buku) ----
    // Perhatikan: class Anggota TIDAK punya atribut/field bertipe Buku
    // atau List<Buku>. Objek Buku hanya "numpang lewat" sebagai parameter
    // method pinjamBuku() dan kembalikanBuku(), dipakai sesaat lalu tidak
    // disimpan sebagai bagian permanen dari Anggota. Relasi selemah ini -
    // hanya "menggunakan sementara" - disebut Dependency, ditandai dengan
    // tanda panah putus-putus (..>) pada diagram.
    public boolean pinjamBuku(Buku buku) {
        if (buku != null && buku.isTersedia()) {
            buku.setTersedia(false);
            System.out.println(nama + " meminjam buku: " + buku.getInfo());
            return true;
        }
        System.out.println(nama + " gagal meminjam, buku tidak tersedia.");
        return false;
    }

    public void kembalikanBuku(Buku buku) {
        if (buku != null) {
            buku.setTersedia(true);
            System.out.println(nama + " mengembalikan buku: " + buku.getInfo());
        }
    }

    public String getNama() {
        return nama;
    }
}