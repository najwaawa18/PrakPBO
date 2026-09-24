// MAIN: demonstrasi program (main tidak dihitung sebagai class ke-5)
public class PerpustakaanApp {
    public static void main(String[] args) {
        // Perpustakaan membuat Rak sendiri (COMPOSITION)
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kota Malang");
        Rak rakFiksi = perpus.buatRakBaru("R-FIK-01");
        Rak rakSains = perpus.buatRakBaru("R-SAI-01");

        // Buku dibuat independen, lalu dititipkan ke Rak (AGGREGATION)
        Buku buku1 = new Buku("Laskar Pelangi", "978-1");
        Buku buku2 = new Buku("Kalkulus Dasar", "978-2");
        rakFiksi.tambahBuku(buku1);
        rakSains.tambahBuku(buku2);

        System.out.println("Total buku di " + perpus.getNamaPerpustakaan() + ": " + perpus.getTotalBuku());
        System.out.println();

        // ---- Tampilkan daftar buku di tiap rak ----
        // (bukti nyata bahwa Rak benar-benar menyimpan Buku - relasi Aggregation)
        System.out.println("=== Daftar Buku per Rak ===");
        System.out.println("Rak " + rakFiksi.getKodeRak() + " (" + rakFiksi.getJumlahBuku() + " buku):");
        System.out.println(" - " + buku1.getInfo());
        System.out.println("Rak " + rakSains.getKodeRak() + " (" + rakSains.getJumlahBuku() + " buku):");
        System.out.println(" - " + buku2.getInfo());
        System.out.println();

        // Anggota memakai Buku hanya lewat parameter method (DEPENDENCY)
        System.out.println("=== Simulasi Peminjaman ===");
        Anggota anggota1 = new Anggota("A001", "Rina");
        Anggota anggota2 = new Anggota("A002", "Budi");

        anggota1.pinjamBuku(buku1);      // berhasil, buku1 jadi tidak tersedia
        anggota2.pinjamBuku(buku1);      // GAGAL, karena buku1 sedang dipinjam Rina
        anggota1.kembalikanBuku(buku1);  // Rina kembalikan, buku1 tersedia lagi
        anggota2.pinjamBuku(buku1);      // sekarang berhasil, karena sudah tersedia
        System.out.println();

        // Cari buku lewat rak
        Buku hasilCari = rakSains.cariBuku("978-2");
        if (hasilCari != null) {
            System.out.println("Ditemukan: " + hasilCari.getInfo());
        }
        System.out.println();

        // ---- Ringkasan akhir ----
        System.out.println("=== Ringkasan Perpustakaan ===");
        System.out.println("Nama perpustakaan : " + perpus.getNamaPerpustakaan());
        System.out.println("Jumlah rak         : " + perpus.getJumlahRak());
        System.out.println("Total buku         : " + perpus.getTotalBuku());
    }
}