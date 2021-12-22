package Odev;

// Taksimetre

import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int minUcret, acilisUcreti;
        double yol, kmUcret,topUcret;
        minUcret = 20;
        acilisUcreti = 10;
        kmUcret = 2.2;
        System.out.print("Kaç km mesafe gideceksiniz?");
        yol = inp.nextDouble();
        topUcret = acilisUcreti+(yol*kmUcret);
        boolean onTop = topUcret<20;
        Double top = onTop ? minUcret : topUcret;
        System.out.print(yol+" km mesafe gitmek için toplam ödeyeceğiniz ücret "+top+" TL'dir.");
    }
}
