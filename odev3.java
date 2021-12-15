package Odev;

// Hipotenüs bulma

import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kk,uk,hip,cev,alan,u;
        System.out.print("1. Kenar uzunluğunu giriniz: ");
        kk = inp.nextDouble();
        System.out.print("2. Kenar uzunluğunu giriniz: ");
        uk = inp.nextDouble();
        System.out.print("3. Kenar uzunluğunu giriniz: ");
        hip = inp.nextDouble();
        /* Alıştırma kısmı
        hip = Math.sqrt(kk*kk + uk*uk);
        System.out.print("Hipotenüs uzunluğu: "+hip);
        */
        cev = (kk+uk+hip);
        u = cev/2;
        alan = Math.sqrt(u*(u-kk)*(u-uk)*(u-hip));
        System.out.println("Üçgenin çevresi: "+(int)cev);//ekstra :)
        System.out.print("Üçgenin alanı: ");
        System.out.printf("%.2f", (float)alan);
    }
}