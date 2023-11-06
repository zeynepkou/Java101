
package teksayı;

import java.util.Scanner;


public class Teksayı {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        
        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            
            if (sayi%2 == 1) {
                break; // Kullanıcı 0 girerse döngüyü sonlandır
            }
            
            if (sayi % 2 == 0 || sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
    
}
