package P6;

public class Mobil {
    private String merek;
    private String model;
    private int tahun;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        this.tahun = 2025;
    }

    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    public void cetakInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Mobil m1 = new Mobil("Toyota", "Avanza");
        Mobil m2 = new Mobil("Honda", "Civic", 2022);

        System.out.println("=== DATA MOBIL ===");
        m1.cetakInfo();
        m2.cetakInfo();
    }
}
