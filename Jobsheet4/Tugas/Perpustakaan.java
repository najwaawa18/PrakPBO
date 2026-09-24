import java.util.ArrayList;
import java.util.List;
// CLASS: Perpustakaan
// Memiliki banyak Rak -> relasi ke Rak adalah COMPOSITION
public class Perpustakaan {
    private String namaPerpustakaan;
    private List<Rak> daftarRak;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.daftarRak = new ArrayList<>();
    }

    // ---- COMPOSITION (Perpustakaan *-- Rak) ----
    // Objek Rak dibuat/diciptakan DI DALAM method milik Perpustakaan
    // (bukan dikirim dari luar). Rak adalah bagian utuh (whole-part) dari
    // Perpustakaan: rak tidak punya arti/keberadaan sendiri di luar konteks
    // perpustakaan tempat ia berada, dan jika objek Perpustakaan ini
    // dihancurkan, seluruh objek Rak di dalamnya ikut hancur (strong
    // ownership + lifecycle terikat). Itu sebabnya ini Composition.
    public Rak buatRakBaru(String kodeRak) {
        Rak rakBaru = new Rak(kodeRak); // Rak diciptakan oleh Perpustakaan
        daftarRak.add(rakBaru);
        return rakBaru;
    }

    public int getJumlahRak() {
        return daftarRak.size();
    }

    public int getTotalBuku() {
        int total = 0;
        for (Rak r : daftarRak) {
            total += r.getJumlahBuku();
        }
        return total;
    }

    public String getNamaPerpustakaan() {
        return namaPerpustakaan;
    }
}