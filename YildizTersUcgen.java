package Odevler;

// Yıldızlarla Ters Üçgen Yapma Programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 11.01.2022
 */

public class YildizTersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i, j, k, m, n = 1;
        System.out.print("Basamak sayısını giriniz: ");
        k = inp.nextInt();
        m = k;

        while (n <= k) {
            for (i = 1; i < n; i++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * m - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
            m--;
        }
    }
}
