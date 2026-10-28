package P5;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    @Override
    public void info() {
        System.out.println("--- PERSEGI ---");
        System.out.println("Sisi     : " + sisi);
        super.info();
        System.out.println();
    }
}
