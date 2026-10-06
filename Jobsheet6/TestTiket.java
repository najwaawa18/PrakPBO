package Jobsheet6;

public class TestTiket {

    public static void main(String[] args) {

        // Objek dengan konstruktor tanpa parameter
        // Atribut diisi satu per satu
        
        Tiket tiketDasar = new Tiket();

        tiketDasar.kodeTiket = "KA-001";
        tiketDasar.namaPenumpang = "Andi";
        tiketDasar.asal = "Malang";
        tiketDasar.tujuan = "Jakarta";
        tiketDasar.setHargaDasar(35000); 


        // Tiket Kereta

        TiketKereta kereta = new TiketKereta(
                "KA-001",
                "Andi",
                "Malang",
                "Jakarta",
                350000,
                3,
                "12A"
        );


        // Tiket Pesawat Domestik

        TiketDomestik domestik = new TiketDomestik(
                "GA-102",
                "Sinta",
                "Surabaya",
                "Denpasar",
                900000,
                "Garuda Indonesia",
                25,
                75000
        );

        // Tiket Pesawat Internasional

        TiketInternasional internasional = new TiketInternasional(
                "SQ-205",
                "Budi",
                "Jakarta",
                "Singapura",
                2500000,
                "Singapore Airlines",
                20,
                "C1234567",
                150000
        );


        // Menampilkan hasil

        System.out.println("=========== Tiket Kereta ===========");

        kereta.tampilKereta();

        System.out.println();


        System.out.println("======= Tiket Pesawat Domestik =======");

        domestik.tampilDomestik();

        System.out.println();


        System.out.println("===== Tiket Pesawat Internasional =====");

        internasional.tampilInternasional();
    }
}
