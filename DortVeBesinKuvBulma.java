package Odevler;

// 4 ve 5 in katı olan sayıları bulma

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 29.12.2021
 */

public class DortVeBesinKuvBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, i, j;
        i = 1;
        j = 1;

        System.out.print("Üst sınır giriniz: ");
        n = inp.nextInt();

        System.out.println(n + "'e/a kadar olan 4 in kuvveti olan sayılar:  ");

        do {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            i *= 4;
        } while (i <= n);

        System.out.println("\n" + n + "'e/a kadar olan 5 in kuvveti olan sayılar:  ");

        do {
            if (j % 5 == 0) {
                System.out.println(j);
            }
            j *= 5;
        } while (j <= n);
    }

}
