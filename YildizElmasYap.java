package Odevler;

// Yıldızlardan Elmas Yapma Programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 31.12.2021
 */

public class YildizElmasYap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, a, b, c;

        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();

        for (a = 1; a <= n; a++) {
            for (b = 1; b <= (n - a); b++) {
                System.out.print(" ");
            }

            for (c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (a = 1; a < n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= (2 * n - (2 * a + 1)); c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
