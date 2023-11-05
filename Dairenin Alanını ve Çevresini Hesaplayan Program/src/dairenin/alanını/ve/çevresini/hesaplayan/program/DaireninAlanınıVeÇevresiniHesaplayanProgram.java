
package dairenin.alanını.ve.çevresini.hesaplayan.program;

import java.util.Scanner;


public class DaireninAlanınıVeÇevresiniHesaplayanProgram {

    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz:");
        int r=scan.nextInt();
        System.out.println("Merkez acıyı giriniz:");
        int acı=scan.nextInt();
        
        double sonuc=(Math.PI*(r*r)*acı)/360;
        System.out.println("Yarıçapı r, merkez açısının ölçüsü 𝛼cı olan daire diliminin alanı:"+sonuc);
        
    }
    
}
