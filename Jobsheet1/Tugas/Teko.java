package Tugas;

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