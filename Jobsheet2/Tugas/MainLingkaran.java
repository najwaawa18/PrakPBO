package Jobsheet2.Tugas;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 7;

        System.out.println("Luas Lingkaran     : " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + l1.hitungKeliling());
    }
}
