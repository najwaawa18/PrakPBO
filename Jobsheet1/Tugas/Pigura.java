package Tugas;
public class Pigura {
    private String ukuran;
    private String warnaBingkai;

    public Pigura(String ukuran, String warnaBingkai) {
        this.ukuran = ukuran;
        this.warnaBingkai = warnaBingkai;
    }

    public void pasangFoto(String namaFoto) {
        System.out.println("Memasang foto '" + namaFoto + "' ke dalam pigura.");
    }

    public void gantungWall() {
        System.out.println("Pigura berhasil digantung di dinding.");
    }

    public void printInfo() {
        System.out.println("=== INFO PIGURA ===");
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Warna  : " + warnaBingkai);
        System.out.println("--------------------");
    }
}