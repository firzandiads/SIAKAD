import java.util.Scanner;

public class TugasPertemuan5 {
    public static void main(String[] args) {
        System.out.println("Pendataan IPK mahasiswa semester terakhir");
        System.out.println(" ");
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukan nama lengkap anda = ");
            String namaLengkap = scanner.nextLine();
            System.out.print("Masukan nilai IPK anda = ");
            Double ipk = scanner.nextDouble();
            System.out.print("Masukan lama masa studi anda = ");
            Double tahun = scanner.nextDouble();

            System.out.println(" ");

            if (ipk >= 3.51 && tahun <=4) {
                System.out.println("Selamat " + namaLengkap + " dinyatakan lulus Summa Cumlaude");
            } else if (ipk >= 3.51 ) {
                System.out.println("Selamat " + namaLengkap + " dinyatakan lulus Cumlaude");
            } else if (ipk >= 3.01 && ipk < 3.51) {
                System.out.println("Selamat " + namaLengkap + " dinyatakan lulus dengan sangat memuaskan");
            } else if (ipk >= 2.76 && ipk < 3.01) {
                System.out.println("Selamat " + namaLengkap + " dinyatakan lulus memuaskan");
            } else if (ipk >= 2.00 && ipk < 2.76) {
                System.out.println("Selamat " + namaLengkap + " dinyatakan lulus dengan cukup");
            } else if (ipk < 2.00) {
                System.out.println("Maaf " + namaLengkap + " dinyatakan tidak lulus");
            } else if (ipk > 4.00 && ipk < 0) {
                System.out.println("Data yang dimasukan tidak valid");
            }
        }
        System.out.println("             Terima Kasih");
    }             
}
