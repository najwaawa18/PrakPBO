package UTS;

public class MemberBasic extends Membership {

    public MemberBasic(String kode, String namaMember, int bulan) {
        super(kode, namaMember, bulan);
    }

    @Override
    public int hitungIuran() {
        return (200000 * bulan) + 50000;
    }

    @Override
    public String getJenis() {
        return "Basic";
    }
}
