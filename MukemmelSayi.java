package Odevler;

// Mükemmel sayı kontrol etme programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since .01.2022
 */

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, i, j = 1;
        while (j != 0) {
            int k = 0;
            System.out.println("(Çıkmak için '0' giriniz." +
                    "\nBir sayı giriniz: ");
            a = inp.nextInt();
            j = a;

            for (i = 1; i < a; i++) {
                if (a % i == 0) {
                    k += i;
                }
            }

            if (j != 0) {
                if (k == a) {
                    System.out.println(a + " mükemmel sayıdır.");
                } else {
                    System.out.println(a + " mükemmel sayı değildir.");
                }
            }
        }
    }
}
