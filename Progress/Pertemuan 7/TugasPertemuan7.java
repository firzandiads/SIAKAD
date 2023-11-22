import java.util.Scanner;

public class TugasPertemuan7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai n = ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            for (int i = (n/2)+1; i > 1; i--) {
                for (int j = n-2; j >+ i - 1; j--) {
                        System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    if (k == i - 1) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                }
                    System.out.println();
                
            }
            for (int i = 1; i <= (n/2)+1; i++) {
                for (int j = i; j <= n-2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i*2)-2; k++) {
                    if (k == i - 1) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            } 
        } else {
            for (int i = 1; i <= n; i++) {
                if (i%2==1){
                    for (int j = 1; j < (i / 2) + 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k <= n; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            for (int i = n-1; i >= 1; i--) {
                if(i%2==1){
                    for (int j = 1; j < (i / 2) + 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k <= n; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } 
        }
    }
}