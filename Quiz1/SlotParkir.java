package Quiz1;

public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    public SlotParkir(int nomor){
        this.nomor = nomor;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public boolean isKosong(){
        return kendaraan == null;
    }
    public String info(){
        String info = "";
        info += "Nomor Parkir: " + nomor + "\n";
        if (kendaraan != null) {
            info += kendaraan.info();
        } else {
            info += "Status: Kosong\n";
        }
        return info;
    }
}