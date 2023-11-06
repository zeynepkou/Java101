

package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bir çift sayı girin: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Lütfen çift bir sayı girin.");
            return;
        }

        int yarisi = n / 2;
        
        
        for (int i = 1; i <= yarisi; i++) {
            for (int j = 1; j <= yarisi - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = yarisi; i >= 1; i--) {
            for (int j = 1; j <= yarisi - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
