
package çin.zodyagı.hesaplama;

import java.util.Scanner;


public class ÇinZodyagıHesaplama {

    
    public static void main(String[] args) {
        System.out.println("Çin Zodyağı Değerini Hesaplama");
        Scanner input = new Scanner(System.in);
        
        int dogumYili;
        System.out.print("Doğum Yılınızı Giriniz :");
        dogumYili = input.nextInt();
        
        if(dogumYili%12==0)
        {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if(dogumYili%12==1)
        {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if(dogumYili%12==2)
        {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if(dogumYili%12==3)
        {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if(dogumYili%12==4)
        {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if(dogumYili%12==5)
        {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        if(dogumYili%12==6)
        {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if(dogumYili%12==7)
        {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if(dogumYili%12==8)
        {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        if(dogumYili%12==9)
        {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if(dogumYili%12==10)
        {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if(dogumYili%12==11)
        {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    } 
    
    
}
