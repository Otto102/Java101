package Giris;
/**
 * @Author Osman Kurun - 15.12.2021
 */

//Not ORtalaması Hesaplama

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float mat,fizik,kimya,tr,tarih,mzk,ort;
        System.out.print("Matematik notunuz :");
        mat = inp.nextFloat();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextFloat();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextFloat();

        System.out.print("Tarih notunuz :");
        tarih = inp.nextFloat();

        System.out.print("Türkçe notunuz :");
        tr = inp.nextFloat();

        System.out.print("Müzik notunuz :");
        mzk = inp.nextFloat();

        ort = (mat+fizik+kimya+tarih+tr+mzk)/6;

        System.out.println("Dönem ortalamanız: " + ort  );

        boolean durum = ort>=60;

        String sonuc = durum ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.print(sonuc);
    }
}
