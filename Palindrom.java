package Odevler;

// Palindrom sayı bulma programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 17.01.2022
 */

public class Palindrom {

    static boolean isPalindrom(int num) {
        int temp, revNum = 0, lastDigit;
        temp = num;
        while (temp != 0) {
            lastDigit = temp % 10;
            revNum = revNum * 10 + lastDigit;
            temp /= 10;
        }

        if (revNum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        n = inp.nextInt();

        if (isPalindrom(n)) {
            System.out.print(n + "bir Palindrom sayıdır.");
        } else {
            System.out.print(n + " bir Palindrom sayı değildir.");
        }

    }

}
