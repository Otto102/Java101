package Odev;

// Dairenin alanı

import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r,alan,cevre,pi,a,dilim;
        pi = 3.14;
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextDouble();
//        alan = pi*r*r;
//        cevre = 2*pi*r;
//        System.out.print("Daireneni alanı: "+alan);
//        System.out.print("Daireneni çevresi: "+cevre);

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        a = inp.nextDouble();
        dilim = (pi*(r*r)*a)/360;
        System.out.print("Açısı "+a+"° olan daire diliminin alanı: ");
        System.out.printf("%.2f", dilim);
    }
}