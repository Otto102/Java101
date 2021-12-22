package Odevler;

// Hesap Makinesi

import java.util.Scanner;

/**
 * @Author Osman Kurun - 16.12.2021
 */

public class odev8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nu1, nu2, proc;

        System.out.print("Birinici sayıyı giriniz: ");
        nu1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        nu2 = inp.nextInt();

        System.out.print("1) Toplama\n2) Çıkarma\n3) Çarpma\n4) Bölme\nBir işlem seçiniz: ");
        proc = inp.nextInt();

        switch (proc) {
            case 1:
                System.out.print(nu1 + " + " + nu2 + " = " + (nu1 + nu2));
                break;
            case 2:
                System.out.print(nu1 + " - " + nu2 + " = " + (nu1 - nu2));
                break;
            case 3:
                System.out.print(nu1 + " * " + nu2 + " = " + (nu1 * nu2));
                break;
            case 4:
                if (nu2 != 0) {
                    System.out.print(nu1 + " / " + nu2 + " = " + (nu1 / nu2));
                    break;
                } else {
                    System.out.print("Bir sayı sıfıra bölünemez!");
                    break;
                }
            default:
                System.out.print("Geçersiz tercih yaptınız, tekrar deneyin.");

        }
        System.out.print("\nİşlem tamamlandı.");

    }
}
