package Odevler;

// Çin Zodiac Hesaplama

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class CinZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int dogum, kalan;
        String zodiac = "";
        boolean hata = false;

        System.out.print("Doğum tarihinizi giriniz: ");
        dogum =inp.nextInt();
        kalan = dogum%=12;

        switch (kalan){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                hata = true;
                break;
        }

        if (hata){
            System.out.print("Geçersiz bir değer girdiniz.");
        }else {
            System.out.print("Çin Zodiac'ına göre burcunuz: "+zodiac+" Burcu");
        }





    }

}
