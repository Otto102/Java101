package Odevler;

// Sınıf geçme durumunu hesaplayan program

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class odev10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,fizik,trk,kim,mzk;
        int mat2,fizik2,trk2,kim2,mzk2;

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        mat2 = (mat<100||mat>0) ? mat:0;

        System.out.print("Türkçe notunuz: ");
        trk = inp.nextInt();
        trk2 = (trk<100||trk>0) ? trk:0;

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        fizik2 = (fizik<100||fizik>0) ? fizik:0;

        System.out.print("Kimya notunuz: ");
        kim = inp.nextInt();
        kim2 = (kim<100||kim>0) ? kim:0;

        System.out.print("Müzik notunuz: ");
        mzk = inp.nextInt();
        mzk2 = (mzk<100||mzk>0) ? mzk:0;

        double ort = (mat2+fizik2+trk2+kim2+mzk2)/5;

        if (ort>=55) {
            System.out.print("Tebrikler, sınıfı geçtiniz.");
        }else {
            System.out.println("Sınıfı geçemediniz. Seneye daha sıkı çalışın!");
        }

        System.out.print("Dönem not ortalamanız: "+ort);

    }

}