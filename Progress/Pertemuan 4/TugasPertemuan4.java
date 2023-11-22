import java.util.Scanner;

public class TugasPertemuan4 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.print("Masukkan nilai x : ");
            double x = scnr.nextDouble();

            System.out.print("Masukkan nilai y : ");
            double y = scnr.nextDouble();

            double jumlah = x + y;
            double kurang = x - y;
            double kali = x * y;
            double bagi = x / y;
            double modulus = x % y;
            
            System.out.println("Hasil x + y = "+jumlah);
            System.out.println("Hasil x - y = "+kurang);
            System.out.println("Hasil x * y = "+kali);
            System.out.println("Hasil x / y = "+bagi);
            System.out.println("Hasil x % y = "+modulus);
        }
    }
}
