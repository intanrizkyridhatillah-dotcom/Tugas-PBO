package P2;

import java.util.Scanner;

public class L1TahunKabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Masukan Tahun (1909 - 2024) : ");
        int tahun = scanner.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        scanner.close();
    }
}
