package Jobsheet7.Tugas1;

public class Segitiga {

    private int sudut;

    // Overloading 1: menghitung sudut ketiga
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Overloading 2: menghitung sudut ketiga
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloading 3: menghitung keliling segitiga
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 4: menghitung sisi miring segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(
            Math.pow(sisiA, 2) + Math.pow(sisiB, 2)
        );
    }
}
