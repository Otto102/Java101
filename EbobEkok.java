package Odevler;

// EBOB EKOK bulma programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 10.01.2022
 */

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kucukSayi, buyukSayi, i, ebob, ekok;
        boolean islem = false;

        do {
            System.out.println("Küçük sayıyı giriniz: ");
            kucukSayi = inp.nextInt();

            System.out.println("Büyük sayıyı giriniz: ");
            buyukSayi = inp.nextInt();

            if (kucukSayi > buyukSayi) {
                System.out.println("Önce küçük sayıyı giriniz!");
            } else {
                i = kucukSayi;
                while (i > 0) {
                    if (kucukSayi % i == 0 && buyukSayi % i == 0) {
                        ebob = i;
                        ekok = (kucukSayi * buyukSayi) / ebob;
                        System.out.println("EBOB (" + kucukSayi + ", " + buyukSayi + ") = " + ebob);
                        System.out.println("EKOK (" + kucukSayi + ", " + buyukSayi + ") = " + ekok);
                        break;
                    } else {
                        i--;
                    }
                }
            }
        }while (kucukSayi > buyukSayi);
    }
}
