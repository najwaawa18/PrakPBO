package Jobsheet7.Tugas2;

public class Main {

    public static void main(String[] args) {

        // Object Dosen
        Manusia manusia = new Dosen();
        System.out.println("=== DOSEN ===");
        manusia.bernafas();
        manusia.makan();

        System.out.println();

        // Object Mahasiswa
        manusia = new Mahasiswa();
        System.out.println("=== MAHASISWA ===");
        manusia.bernafas();
        manusia.makan();

        System.out.println();

        // Mengakses method khusus Dosen
        Dosen dosen = new Dosen();
        dosen.lembur();

        System.out.println();

        // Mengakses method khusus Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur();
    }
}
