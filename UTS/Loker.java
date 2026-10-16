package UTS;

public class Loker {
    private int nomor;
    private Membership pemakai;

    public Loker(int nomor) {
        this.nomor = nomor;
        this.pemakai = null;
    }

    public int getNomor() {
        return nomor;
    }

    public boolean isKosong() {
        return pemakai == null;
    }

    public Membership getPemakai() {
        return pemakai;
    }

    public boolean sewa(Membership m) {
        if (m == null || !isKosong()) {
            return false;
        }

        pemakai = m;
        return true;
    }
}