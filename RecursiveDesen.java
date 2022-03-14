package Odevler;

// Desene Göre Metot Oluşturma

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 14.03.2022
 */

public class RecursiveDesen {
    static void serial(int a,int k) {
        if (a > 0) {
            System.out.print(a + " ");
            while (a > 0) {
                a -= 5;
                System.out.print(a + " ");
            }
            serial(a,k);
        } else if (a <= 0) {
            while (a < k) {
                a += 5;
                System.out.print(a + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = inp.nextInt();
        int k = a;
        serial(a,k);
    }
}
