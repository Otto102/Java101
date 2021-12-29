package Odevler;

// Dördün Katı Sayıların Toplamını Bulan Program

import java.util.Scanner;

/**
 * @author Osman Kurun - 29.12.2021
 */

public class DortKatıSayiTop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, top;
        top = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                top += n;
            }
        } while (n % 2 != 1 && n % 2 != -1);

        System.out.println("Toplam = " + top);

    }

}
