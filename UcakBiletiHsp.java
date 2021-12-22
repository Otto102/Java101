package Odevler;

// Ucak Bileti

import java.util.Scanner;

/**
 * @author Osman Kurun - 22.12.2021
 */

public class UcakBiletiHsp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int msf, yas, tip;
        double tutar = 0, bilet = 0, araTop = 0, tipTop = 0;
        boolean hata = false;
        boolean onay = false;

        System.out.print("Gitmek istediğiniz mesafeyi km cinsinden giriniz: ");
        msf = inp.nextInt();
        System.out.print("1- Çocuk (0-12 Yaş)\n2 - Genç (12-24 Yaş)\n3 - Yetişkin (24-65 Yaş)\n4 - Yaşlı (65+ Yaş)\nYaş aralığını seçiniz: ");
        yas = inp.nextInt();
        System.out.print("1 - Tek yön\n2 - Gidiş - dönüş\nYolculuk tipini giriniz:");
        tip = inp.nextInt();

        if (msf < 1) {
            hata = true;
        } else {
            if (yas < 1 && yas > 4) {
                hata = true;
            } else {
                if (tip > 2 || tip < 1) {
                    hata = true;
                } else {
                    onay = true;
                    bilet = (msf * 0.1);
                                    }
            }
        }

        if(onay) {
            switch (yas) {
                case 1:
                    araTop = bilet * 0.5;
                    break;
                case 2:
                    araTop = bilet * 0.9;
                    break;
                case 3:
                    araTop = bilet;
                    break;
                case 4:
                    araTop = bilet * 0.7;
                    break;
                default:
                    hata = true;
                    break;
            }

            if (tip == 2) {
                tipTop = araTop * 0.8;
                tutar = tipTop * 2;
            } else {
                tutar = araTop;
            }
        }

        if (hata) {
            System.out.print("Geçersiz değer girdiniz!");
        } else {
            System.out.print("Toplam bilet tutarınız: " + tutar + "TL");
        }

    }

}
