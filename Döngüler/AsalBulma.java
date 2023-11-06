
package java101;

import java.util.Scanner;


public class Java101 {

    
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(i);
            }
        }
    }
}
