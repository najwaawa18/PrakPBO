package UTS;

public class MainVarian10 {
    public static void main(String[] args) {

        Gym gym = new Gym("Fit Center", 10);

        Manajer manajer = new Manajer("Bu Sari");
        gym.setManajer(manajer);

        PersonalTrainer trainer =
                new PersonalTrainer("Coach Bayu", "Strength");

        MemberBasic basic =
                new MemberBasic("GYM-01", "Rara", 3);

        MemberPremium premium =
                new MemberPremium("GYM-02", "Tegar", 5, true);

        premium.setTrainer(trainer);

        premium.perpanjang();

        KartuPrinter printer = new KartuPrinter("Canon");

        printer.cetakKartu(basic);
        printer.cetakKartu(premium);

        gym.sewaLoker(basic);
        gym.sewaLoker(premium, 7);

        gym.tampilInfo();
    }
}
