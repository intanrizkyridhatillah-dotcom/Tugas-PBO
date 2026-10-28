package P6;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku() {
        this.judul = "Belum Diisi";
        this.pengarang = "Anonim";
        this.tahunTerbit = 0;
    }

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 2024;
    }

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("---------------------------------");
    }

    // Method main bisa ditaruh langsung di sini!
    public static void main(String[] args) {
        Buku b1 = new Buku();
        Buku b2 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku b3 = new Buku("Pemrograman Java", "Ahmad", 2023);

        System.out.println("=== INFORMASI BUKU ===");
        b1.tampilkanInfo();
        b2.tampilkanInfo();
        b3.tampilkanInfo();
    }
}