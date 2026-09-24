package Tugas;
public class Headset {
    private String brand;
    private String warna;

    public Headset(String brand, String warna) {
        this.brand = brand;
        this.warna = warna;
    }

    public void naikkanVolume() {
        System.out.println("[" + brand + "] Volume dinaikkan.");
    }

    public void turunkanVolume() {
        System.out.println("[" + brand + "] Volume diturunkan.");
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Warna : " + warna);
    }
}