import java.util.Scanner;

public class TugasPertemuan8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        double jumlah, rata;
        int i;

        System.out.println("                    MEMASUKKAN DATA");
        System.out.println();

        jumlah = 0;
        for (i = 1; i <= 1000; i++) {
            System.out.println("Data " + i);
            System.out.print("Nama Mahasiswa = ");
            String cekNama = scan.nextLine();
            if (cekNama.equals ("exit")) {
                break;
            } else {
                nama[i] = cekNama;
            }

            System.out.print("IPK Mahasiswa = ");
            double cekIpk = scan.nextDouble();
            scan.nextLine();
            ipk[i] = cekIpk;

            System.out.println();
            jumlah += ipk[i];
        }
        System.out.println();
        System.out.println("No   Nama                          IPK ");
        System.out.println("-------------------------------------- ");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "    " + nama[j] + "                        " + ipk[j]);  
        }

        System.out.println();
        rata = jumlah/(i-1);
        System.out.println("Rata-rata IPK = " + rata);      
    }
} 