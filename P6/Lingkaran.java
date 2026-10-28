package P6;

public class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        if (jariJari <= 0) {
            this.jariJari = 1.0; 
        } else {
            this.jariJari = jariJari;
        }
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public void cetakInfo() {
        System.out.println("Jari-jari : " + jariJari);
        System.out.printf("Luas      : %.2f\n", hitungLuas());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(7.0);
        Lingkaran l2 = new Lingkaran(0);   
        Lingkaran l3 = new Lingkaran(-5.0); 

        System.out.println("=== HASIL UJI LINGKARAN ===");
        l1.cetakInfo();
        l2.cetakInfo();
        l3.cetakInfo();
    }
}
