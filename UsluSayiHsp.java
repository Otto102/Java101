package Odevler;

// Üslü Sayı Hesaplama prg

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 30.12.2021
 */

public class UsluSayiHsp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,k;
        long t;
        System.out.print("Taban sayısını giriniz: ");
        a = inp.nextInt();
        System.out.print("Üst sayısını giriniz: ");
        b = inp.nextInt();

        t=1;
        for(k=1;k<=b;k++){
            t*=a;
        }

        System.out.print("Sonuc = "+t);


    }

}
