package P5;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }

    @Override
    public void info() {
        System.out.println("--- PERSEGI PANJANG ---");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        super.info();
        System.out.println();
    }
}
