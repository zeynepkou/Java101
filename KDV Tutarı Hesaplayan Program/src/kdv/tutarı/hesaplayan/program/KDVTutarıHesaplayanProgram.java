
package kdv.tutarı.hesaplayan.program;

import java.util.Scanner;


public class KDVTutarıHesaplayanProgram {

    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Lutfen para degerini giriniz:");
        float para=scan.nextFloat();
        float kdv;
        if(para>0&&para<1000)
        {
            kdv=(para*18)/100;
            System.out.println("KDV'siz Fiyat:"+para);
            System.out.println("KDV tutari:"+kdv);
            float sonuc=para+kdv;
            System.out.println("KDV'li Fiyat:"+sonuc);
        }
        else if(para>1000)
        {
            kdv=(para*8)/100;
            System.out.println("KDV'siz Fiyat:"+para);
            System.out.println("KDV tutari:"+kdv);
            float sonuc=para+kdv;
            System.out.println("KDV'li Fiyat:"+sonuc);
        }
        else
            System.out.println("gecersiz deger girildi.");
        
    }
    
}
