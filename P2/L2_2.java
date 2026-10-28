package P2;
import java.util.Scanner;

public class L2_2 {

    public static void main(String[] args) {
        float jari, keliling, luas;
        final float PI = 3.14f;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        jari = scanner.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

        scanner.close();
    }
}

