package Odevler;

// Küçükten büyüğe sıralama

import java.util.Scanner;

/**
 * @author Osman Kurun - 21.12.2021
 */

public class odev12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();

        if (a>b&&a>c){
            if (b>c){
                System.out.print(c+"<"+b+"<"+a);
            }else {
                System.out.print(b+"<"+c+"<"+a);
            }
        }else if(b>a&&b>c){
            if (a>c){
                System.out.print(c+"<"+a+"<"+b);
            }else {
                System.out.print(a+"<"+c+"<"+b);
            }
        }else {
            if(b>a){
                System.out.print(a+"<"+b+"<"+c);
            }else {
                System.out.print(b+"<"+a+"<"+c);
            }
        }

    }

}
