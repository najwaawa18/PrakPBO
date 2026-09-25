package Quiz1;

public class AreaParkir {
    private String nama;
    private SlotParkir[] arraySlot;

    public AreaParkir(String nama, int jumlah){
        this.nama = nama;
        this.arraySlot = new SlotParkir[jumlah];
        this.initSlot();
    }

    private void initSlot(){
        for (int i = 0; i < arraySlot.length; i++) {
            this.arraySlot[i] = new SlotParkir(i + 1);
        }
    }

    public void parkir(Kendaraan k, int nomor){
        if (nomor < 1 || nomor > arraySlot.length) {
            System.out.println("Nomor slot tidak valid");
            return;
        }
        if (!arraySlot[nomor - 1].isKosong()) {
            System.out.println("Slot " + nomor + " sudah terisi");
            return;
        }
        arraySlot[nomor - 1].setKendaraan(k);
    }

    public void keluar(int nomor){
        this.arraySlot[nomor - 1].setKendaraan(null);
    }

    public int jumlahSlotKosong(){
        int jumlah = 0;
        for (int i = 0; i < arraySlot.length; i++) {
            if (arraySlot[i].isKosong()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public String info(){
        String info = "";
        info += "Area: " + nama + "\n";
        for (int i = 0; i < arraySlot.length; i++) {
            info += "Slot " + (i + 1) + ": ";
            if (arraySlot[i].isKosong()) {
                info += "(Kosong)\n";
            } else {
                info += arraySlot[i].getKendaraan().getPlatNomor()
                        + " - "
                        + arraySlot[i].getKendaraan().getJenis()
                        + "\n";
            }
        }
        return info;
    }
}