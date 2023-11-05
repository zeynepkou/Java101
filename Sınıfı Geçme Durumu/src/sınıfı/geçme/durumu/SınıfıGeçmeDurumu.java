
package sınıfı.geçme.durumu;

import java.util.Scanner;


public class SınıfıGeçmeDurumu {

    
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        
        Scanner scan= new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat=scan.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=scan.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=scan.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        turkce=scan.nextInt();
        
        System.out.println("Muzik notunuzu giriniz:");
        muzik=scan.nextInt();

        int toplam=0;
        toplam+=(mat>0&&mat<100)? mat: 0;
        toplam+=(fizik>0&&mat<fizik)? fizik: 0;
        toplam+=(kimya>0&&kimya<100)? kimya: 0;
        toplam+=(turkce>0&&turkce<100)? turkce: 0;
        toplam+=(muzik>0&&muzik<100)? muzik: 0;
        
        double sonuc=toplam/5.0;
        System.out.println(sonuc);
        if(sonuc<55)
            System.out.println("Sınıfta kaldınız.");
        else
            System.out.println("Sınıfı geçtiniz");
    }
    
}
