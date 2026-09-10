<<<<<<< HEAD
package Jobsheet1.Tugas;
=======
package Tugas;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

public class Teko {
    private String bahan;
    private int kapasitas;

    public Teko(String bahan, int kapasitas) {
        this.bahan = bahan;
        this.kapasitas = kapasitas;
    }

    public void isiAir() {
        System.out.println("Teko diisi air sebanyak " + kapasitas + " ml.");
    }

    public void tuangAir() {
        System.out.println("Air hangat dituangkan dari teko.");
    }

    public void printInfo() {
        System.out.println("=== INFO TEKO ===");
        System.out.println("Bahan     : " + bahan);
        System.out.println("Kapasitas : " + kapasitas + " ml");
        System.out.println("------------------");
    }
}