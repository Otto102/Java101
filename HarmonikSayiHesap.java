package Odevler;

// Harmonik sayı hesaplama programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 30.12.2021
 */

public class HarmonikSayiHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,i;
        double result=0;


        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();

        for(i=1;i<=n;i++){
            result += 1.0/i;
        }

        System.out.print("Sonuç = "+result);

    }

}
