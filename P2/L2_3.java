package P2;
import java.util.Scanner;

public class L2_3 {
    public static void main(String[] args) {
        int jam, menit, detik, totdet;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jam: ");
        jam = scanner.nextInt();
        System.out.print("Masukkan menit: ");
        menit = scanner.nextInt();
        System.out.print("Masukkan detik: ");
        detik = scanner.nextInt();

        totdet = (jam * 3600) + (menit * 60) + detik;

        System.out.println("Total Detik (totdet): " + totdet);

        scanner.close();
    }
}
