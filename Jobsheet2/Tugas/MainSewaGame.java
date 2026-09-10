package Jobsheet2.Tugas;

public class MainSewaGame {
    public static void main(String[] args) {
        SewaGame sg = new SewaGame();
        sg.id = "M001";
        sg.namaMember = "Najwa";
        sg.namaGame = "Elden Ring";
        sg.lamaSewa = 3;
        sg.hargaSewa = 25000;

        sg.tampilkanData();
    }
}
