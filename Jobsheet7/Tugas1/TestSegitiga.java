package Jobsheet7.Tugas1;

public class TestSegitiga {

    public static void main(String[] args) {

        Segitiga s = new Segitiga();

        System.out.println(
            "Sudut ketiga: " + s.totalSudut(60)
        );

        System.out.println(
            "Sudut ketiga: " + s.totalSudut(60, 50)
        );

        System.out.println(
            "Keliling segitiga: " + s.keliling(3, 4, 5)
        );

        System.out.println(
            "Sisi miring: " + s.keliling(3, 4)
        );
    }
}
