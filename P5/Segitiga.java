package P5;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    @Override
    public void hitungKeliling() {
        // cari miring pakai pythagoras
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        keliling = alas + tinggi + miring;
    }

    @Override
    public void info() {
        System.out.println("--- SEGITIGA ---");
        System.out.println("Alas     : " + alas);
        System.out.println("Tinggi   : " + tinggi);
        super.info();
        System.out.println();
    }
}
