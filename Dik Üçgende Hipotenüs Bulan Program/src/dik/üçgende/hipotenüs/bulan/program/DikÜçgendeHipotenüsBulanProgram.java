
package dik.üçgende.hipotenüs.bulan.program;

import java.util.Scanner;


public class DikÜçgendeHipotenüsBulanProgram {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen dik kenarlardan ilkini giriniz:");
        int dik1=scan.nextInt();
        System.out.println("Lutfen dik kenarlardan ikinciyi giriniz:");
        int dik2=scan.nextInt();
        
        Double hipotenüs=Math.sqrt((dik2*dik2)+(dik1*dik1));
        System.out.println("Hipotenüs:"+hipotenüs);
        
    }
    
}
