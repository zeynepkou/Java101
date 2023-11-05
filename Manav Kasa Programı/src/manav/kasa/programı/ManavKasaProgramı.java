
package manav.kasa.programı;

import java.util.Scanner;


public class ManavKasaProgramı {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        double armut= 2.14;
        double elma=  3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;
     
        System.out.println("Armut Kac kİlo:");
        int a=input.nextInt();
        System.out.println("Elma Kac kİlo:");
        int e=input.nextInt();
        System.out.println("Domates Kac kİlo:");
        int d=input.nextInt();
        System.out.println("Muz Kac kİlo:");
        int m=input.nextInt();
        System.out.println("Patlican Kac kİlo:");
        int p=input.nextInt();
        
        double toplam=armut*a+elma*e+domates*d+muz*m+patlican*p;
        System.out.println("Toplam Tutar:"+toplam);
        
        
        
        
        
    }
    
}
