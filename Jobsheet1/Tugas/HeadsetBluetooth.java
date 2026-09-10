<<<<<<< HEAD
package Jobsheet1.Tugas;
=======
package Tugas;

>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce
public class HeadsetBluetooth extends Headset {
    private int kapasitasBaterai;
    private String versiBluetooth;

    public HeadsetBluetooth(String brand, String warna, int kapasitasBaterai, String versiBluetooth) {
        super(brand, warna);
        this.kapasitasBaterai = kapasitasBaterai;
        this.versiBluetooth = versiBluetooth;
    }

    public void hubungkanBluetooth() {
        System.out.println("Bluetooth v" + versiBluetooth + " berhasil terhubung.");
    }

    public void isiDaya() {
        System.out.println("Mengisi daya baterai " + kapasitasBaterai + " mAh...");
    }

    @Override
    public void printInfo() {
        System.out.println("=== INFO HEADSET BLUETOOTH ===");
        super.printInfo();
        System.out.println("Baterai : " + kapasitasBaterai + " mAh");
        System.out.println("Versi BT: " + versiBluetooth);
        System.out.println("------------------------------");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce
