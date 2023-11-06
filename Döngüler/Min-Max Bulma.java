
package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin.");
            return;
        }

        
        System.out.print("1. sayıyı girin: ");
        int number = scanner.nextInt();
        int min = number;
        int max = number;

        for (int i = 2; i <= N; i++) {
            System.out.print(i + ". sayıyı girin: ");
            number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
