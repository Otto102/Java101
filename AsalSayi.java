package Odevler;

// Asal sayı bulma  programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 11.01.2022
 */

public class AsalSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, i, j;
        System.out.println("Bir sayı giriniz: ");
        n = inp.nextInt();

        for (i = 2; i < n; i++) {
            boolean check = false;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print(i + " ");
            }
        }
    }
}
