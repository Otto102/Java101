package Odevler;

// Hesap Makinesi

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class GirilenSayidaHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        b = 1;
        c = 0;
        d = 0;

        System.out.print("Sayılar: ");
        while (b <= a) {
                        if (b % 12 == 0) {
                c += b;
                d += 1;
                System.out.print(b+", ");
            }
            b++;
        }
        System.out.print("\b\b");
        System.out.println();
        System.out.println("Girilen sayıya kadar olan 3 ve 4 e bölünen sayıların ortalaması: "+(c/d));

    }

}
