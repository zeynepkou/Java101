
package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = sayi; i >= 1; i--) {
            for (int j = 1; j <= sayi - i; j++) {
                System.out.print(" "); // Boşluk ekleyin
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Yıldız ekleyin
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geçin
        }
    }
}
