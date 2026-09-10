<<<<<<< HEAD
package Jobsheet1.Tugas;
=======
package Tugas;
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce

public class TugasDemo {
    public static void main(String[] args) {
        // Objek Teko
        Teko tekoAir = new Teko("Plastik", 750);
        tekoAir.isiAir();
        tekoAir.tuangAir();
        tekoAir.printInfo();

        // Objek Pigura
        Pigura piguraFoto = new Pigura("10R", "Hitam");
        piguraFoto.pasangFoto("Wisuda");
        piguraFoto.gantungWall();
        piguraFoto.printInfo();

        // Objek HeadsetKabel
        HeadsetKabel hsKabel = new HeadsetKabel("Polytron", "Hitam", 1.2, "3.5mm");
        hsKabel.colokJack();
        hsKabel.naikkanVolume();
        hsKabel.gulungKabel();
        hsKabel.printInfo();

        // Objek HeadsetBluetooth
        HeadsetBluetooth hsBT = new HeadsetBluetooth("Robot", "Hitam", 400, "5.3");
        hsBT.hubungkanBluetooth();
        hsBT.turunkanVolume();
        hsBT.isiDaya();
        hsBT.printInfo();
    }
}