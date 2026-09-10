<<<<<<< HEAD
package Jobsheet1.Tugas;
=======
package Tugas;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

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