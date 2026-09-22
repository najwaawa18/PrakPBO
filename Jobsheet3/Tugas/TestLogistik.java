package Jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input tambah muatan
        System.out.print("\nMasukkan berat muatan yang ingin dimasukkan: ");
        double beratMasuk = Scanner.nextDouble();

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input turunkan muatan
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan: ");
        double beratTurun = Scanner.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        Scanner.close();
    }
}

