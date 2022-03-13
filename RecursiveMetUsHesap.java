package Odevler;

// Recursive Method ile Üs hesaplama

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 13.03.2022
 */

public class RecursiveMetUsHesap {

    static double power(int b, int p) {
        Scanner inp = new Scanner(System.in);
        double result = 1;
        int i;

        if (p > 0) {
            for (i = 1; i <= p; i++) {
                result *= b;
            }
        } else if (p < 0) {
            for (i = -1; i >= p; i--) {
                result *= b;
            }
            result = 1 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int b, p;
        System.out.print("Taban sayısını giriniz: ");
        b = inp.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        p = inp.nextInt();

        System.out.println("Sonuç = " + power(b, p));


    }

}
