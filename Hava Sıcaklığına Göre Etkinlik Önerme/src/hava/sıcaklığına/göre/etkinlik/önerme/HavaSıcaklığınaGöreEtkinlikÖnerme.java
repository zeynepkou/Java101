
package hava.sıcaklığına.göre.etkinlik.önerme;

import java.util.Scanner;


public class HavaSıcaklığınaGöreEtkinlikÖnerme {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Sıcakığı giriniz (°C):");
        heat = input.nextInt();

        if (heat < 5){

            System.out.println("Kayak yapabilirsin");
        }

        else if (heat >= 5 && heat < 15) {

            System.out.println("Sinemaya gidebilirsin");
        }

        else if (heat >= 15 && heat < 25 ) {

            System.out.println("Piknik yapabilirsin");
        }

        else if (heat >= 25){

            System.out.println("Yüzmeye gidebilirsin");
        }
    }
    
}
