
package girilen.sayıya.kadar.olan.çift.sayıları.bulan.program;

import java.util.Scanner;


public class GirilenSayıyaKadarOlanÇiftSayılarıBulanProgram {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        double number=input.nextInt();
        int i=1;
        double j=0;
        double toplam=0;
        while(i<number)
        {
            if((i%4==0) && (i%3==0))
            {
                toplam += i;
                j++;
                
            }
            i++;
        }
        double sonuc=toplam/j;
        System.out.println(sonuc);
    }
    
}
