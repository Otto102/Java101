package Odevler;

// Bir sayının basmak sayılarının toplamı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 30.12.2021
 */

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int nu, tempNu, digitValue = 0, powValue, result = 0;

        System.out.print("Bir sayı giriniz:");
        nu = inp.nextInt();

        tempNu = nu;

        while (tempNu != 0) {
            digitValue = tempNu % 10;
            result += digitValue;
            tempNu /= 10;
        }
            System.out.print(nu + " sayısının basamak değerleri toplamı: "+ result);
    }

}
