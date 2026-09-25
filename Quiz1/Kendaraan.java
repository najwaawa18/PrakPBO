package Quiz1;

public class Kendaraan {
    private String platNomor;
    private String jenis;

    public Kendaraan(String platNomor, String jenis){
        this.platNomor = platNomor;
        this.jenis = jenis;
    }
    public String getPlatNomor(){
        return platNomor;
    }
    public String getJenis(){
        return jenis;
    }
    public String info(){
        String info = " ";
        info += "Plat Nomor: " +  platNomor + "\n";
        info += "Jenis Kendaraan: " + jenis + "\n";
        return info;
    }
}
