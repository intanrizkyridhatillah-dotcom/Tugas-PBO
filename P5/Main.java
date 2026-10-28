package P5;

public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi(4);
        p.hitungLuas();
        p.hitungKeliling();
        p.info();

        PersegiPanjang pp = new PersegiPanjang(6, 4);
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.info();

        // Segitiga
        Segitiga s = new Segitiga(6, 8);
        s.hitungLuas();
        s.hitungKeliling();
        s.info();

        Lingkaran l = new Lingkaran(7);
        l.hitungLuas();
        l.hitungKeliling();
        l.info();
    }
}
