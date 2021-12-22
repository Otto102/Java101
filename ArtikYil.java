package Odevler;

// Artık Yıl Hesaplama

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yil, yilMod, mod400, mod100;
        boolean artikMi = false;

        System.out.print("Yıl giriniz: ");
        yil = inp.nextInt();
        yilMod = yil;
        mod400 = yilMod %= 400;
        mod100 = yilMod %= 100;

        if (((yilMod %= 4) == 0) && (mod100 != 0)) {
            artikMi = true;
        } else if (mod400==0){
            artikMi = true;
        }else {
            artikMi = false;
        }

        if (artikMi) {
            System.out.print(yil + " artık bir yıldır.");
        } else {
            System.out.print(yil + " artık bir yıl değildir.");
        }

    }

}
