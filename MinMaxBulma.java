package Odevler;

// Girilen sayılardan en büyük ve en küçük olanı bulma programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 11.01.2022
 */

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k, n, i, min = 1, max = 1;

        System.out.println("Kaç sayı gireceksiniz?");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            System.out.println("Bir sayı giriniz: ");
            n = inp.nextInt();
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        System.out.println("Girilen sayıların en büyüğü: " + max);
        System.out.println("Girilen sayıların en küçüğü: " + min);
    }

}
