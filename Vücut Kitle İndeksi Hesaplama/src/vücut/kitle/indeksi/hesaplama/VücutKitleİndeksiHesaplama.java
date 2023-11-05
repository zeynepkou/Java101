
package vücut.kitle.indeksi.hesaplama;

import java.util.Scanner;


public class VücutKitleİndeksiHesaplama {

    
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz:");
        float height=girdi.nextFloat();
        System.out.println("Lutfen kilonuzu giriniz:");
        int weight=girdi.nextInt();
        
        double Vki=weight/(height*height);
        System.out.println("Vucut Kutle Indeksiniz:"+Vki);
    }
    
}
