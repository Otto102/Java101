package Odevler;

// Fibonacci serisini hesaplama programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 12.01.2022
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, n, a = 0, b = 1, c = 0;

        System.out.print("Fibonacci serisi hesaplamak istediğiniz sayıyı giriniz: ");
        n = inp.nextInt();

        System.out.print(n + " Elemanlı Fibonacci Serisi: " + 0);

        for (i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            b = a;
            a = c;
        }
    }
}

