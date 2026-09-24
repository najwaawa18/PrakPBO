import java.util.ArrayList;
import java.util.List;
// CLASS: Rak
// Menyimpan banyak Buku -> relasi ke Buku adalah AGGREGATION
public class Rak {
    private String kodeRak;
    private List<Buku> daftarBuku;

    public Rak(String kodeRak) {
        this.kodeRak = kodeRak;
        this.daftarBuku = new ArrayList<>();
    }

    // ---- AGGREGATION (Rak o-- Buku) ----
    // Objek Buku dibuat di LUAR class Rak, lalu "dititipkan" ke rak lewat
    // parameter method ini. Rak hanya menampung referensi, bukan pemilik
    // tunggal siklus hidup Buku: jika Rak ini dihapus/diganti, objek Buku
    // TETAP ada (bisa dipindah ke rak lain, dipinjam anggota, dsb).
    // Itu sebabnya ini Aggregation, bukan Composition.
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku cariBuku(String isbn) {
        for (Buku b : daftarBuku) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public String getKodeRak() {
        return kodeRak;
    }

    public int getJumlahBuku() {
        return daftarBuku.size();
    }
}