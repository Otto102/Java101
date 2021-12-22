package Odev;

// Manav Kasası

import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut,elma,dom,muz,pat,armutK,elmaK,domK,muzK,patK,top;
        armut=2.14;
        elma=3.67;
        dom=1.11;
        muz=0.95;
        pat=5;
        System.out.print("Kaç kilo armut alacaksınız? :");
        armutK = inp.nextDouble();
        System.out.print("Kaç kilo elma alacaksınız? :");
        elmaK = inp.nextDouble();
        System.out.print("Kaç kilo domates alacaksınız? :");
        domK = inp.nextDouble();
        System.out.print("Kaç kilo muz alacaksınız? :");
        muzK = inp.nextDouble();
        System.out.print("Kaç kilo patlıcan alacaksınız? :");
        patK = inp.nextDouble();
        top = (armut*armutK)+(elma*elmaK)+(dom*domK)+(muz*muzK)+(pat*patK);
        System.out.print("Toplam tutar: "+top+ " TL");
    }
}
