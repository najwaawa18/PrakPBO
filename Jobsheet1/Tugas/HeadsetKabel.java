<<<<<<< HEAD
package Jobsheet1.Tugas;
=======
package Tugas;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

public class HeadsetKabel extends Headset {
    private double panjangKabel;
    private String tipeJack;

    public HeadsetKabel(String brand, String warna, double panjangKabel, String tipeJack) {
        super(brand, warna);
        this.panjangKabel = panjangKabel;
        this.tipeJack = tipeJack;
    }

    public void colokJack() {
        System.out.println("Jack " + tipeJack + " dicolokkan ke perangkat.");
    }

    public void gulungKabel() {
        System.out.println("Kabel sepanjang " + panjangKabel + " m digulung rapi.");
    }

    @Override
    public void printInfo() {
        System.out.println("=== INFO HEADSET KABEL ===");
        super.printInfo();
        System.out.println("Panjang Kabel : " + panjangKabel + " m");
        System.out.println("Tipe Jack     : " + tipeJack);
        System.out.println("--------------------------");
    }
}