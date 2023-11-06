
package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int number=input.nextInt();
        int i;
        int sonuc1=1;
        int sonuc2=1;
        for(i=0;i<number;i++)
        {
            sonuc1 *=4;
            sonuc2 *=5;
             System.out.println(sonuc1);
             System.out.println(sonuc2);
        }
       
    }
    
}
