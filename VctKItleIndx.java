package Odev;

// Vücut Kitle Endeksi

import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,kilo,endeks;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinisinden giriniz: ");
        kilo = inp.nextDouble();
        endeks = kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz "+endeks+"'dir.");
    }
}
