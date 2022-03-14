package Odevler;

// Recursive method ile asal sayı bulma  programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 13.03.2022
 */

public class RecursiveAsalSayi {
    static void prime(int a, int i) {
        if (a == i) {
            System.out.println(a + " asal bir sayıdır.");
            return;
        } else if (a % i == 0) {
            System.out.println(a + " asal bir sayı değildir.");
            return;
        }
        i++;
        prime(a, i);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        do {
            System.out.print("Bir sayı giriniz :");
            a = inp.nextInt();
            prime(a, 2);
        } while (a != 0);

    }
}
