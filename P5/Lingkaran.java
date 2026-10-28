package P5;

public class Lingkaran extends BangunDatar {
    private double r;
    private final double PI = 3.14;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        luas = PI * r * r;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * PI * r;
    }

    @Override
    public void info() {
        System.out.println("--- LINGKARAN ---");
        System.out.println("Jari-jari: " + r);
        super.info();
        System.out.println();
    }
}
