
package artık.yıl.hesaplama;

import java.util.Scanner;


public class ArtıkYılHesaplama {

    
    public static void main(String[] args) {
        System.out.println("Artık Yıl Hesaplama");        
        Scanner input = new Scanner(System.in);
        
        int year;
        System.out.print("Yıl Giriniz :");
        year = input.nextInt();
        
        if(year%4==0)
        {
            System.out.println(year+" "+"bir artık yıldır!");
        }
        else
        {
            System.out.println(year+" "+"bir artık yıl değildir!");
        }      
    }
    
}
