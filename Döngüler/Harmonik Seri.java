
package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bir sayı girin: ");
        double sayi = scanner.nextDouble();

        
        double harmonikToplam = 0.0;

        
        for (int i = 1; i <= sayi; i++) {
            harmonikToplam += 1.0 / i;
        }

        
        System.out.println("Harmonik serinin toplamı: " + harmonikToplam);
    }
    
}
