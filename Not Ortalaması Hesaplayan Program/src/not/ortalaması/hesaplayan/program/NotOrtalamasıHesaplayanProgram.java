
package not.ortalaması.hesaplayan.program;

import java.util.Scanner;


public class NotOrtalamasıHesaplayanProgram {

    
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
         Scanner scan= new Scanner(System.in);
         
         System.out.println("Matematik notunuzu giriniz:");
         mat=scan.nextInt();
         
         System.out.println("Fizik notunuzu giriniz:");
         fizik=scan.nextInt();
         
         System.out.println("Kimya notunuzu giriniz:");
         kimya=scan.nextInt();
         
         System.out.println("Turkce notunuzu giriniz:");
         turkce=scan.nextInt();
         
         System.out.println("Tarih notunuzu giriniz:");
         tarih=scan.nextInt();
         
         System.out.println("Muzik notunuzu giriniz:");
         muzik=scan.nextInt();
         
         int toplam=mat+fizik+kimya+turkce+tarih+muzik;
         double sonuc=toplam/6.0;
         System.out.println(sonuc);
         
         System.out.println(sonuc > 60 ? "Tebrikler sinifi gectiniz" : "Sinifta kaldiniz ");
         
    }
    
}
