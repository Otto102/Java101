package Odevler;

// Combinasyon hesaplama

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 30.12.2021
 */

public class CombHesp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // A = a! , B = b! , c = (a-b)! , C = Kombinasyon
        int a, b, A, B, c, C, k;
        A = 1;
        B = 1;
        c = 1;

        System.out.print("A sayısını giriniz: ");
        a = inp.nextInt();
        System.out.print("B sayısını giriniz: ");
        b = inp.nextInt();

        for (k = 1; k <= a; k++) {
            A *= k;
        }
        for (k = 1; k <= b; k++) {
            B *= k;
        }
        for (k = 1; k <= (a - b); k++) {
            c *= k;
        }

        C = A / (B * c);

        System.out.print("C("+a+","+b+") = "+C);


    }

}
