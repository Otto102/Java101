package Odev;
import java.util.Scanner;

/**
 * @Author Osman Kurun - 15.12.2021
 */

public class odev2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double urun,kdvL,kdvH;
        System.out.print("Ürün fiyatı: ");
        urun = inp.nextFloat();

        kdvH = 1.180;
        kdvL = 1.080;

        double kdvli = urun>1000 ? urun*kdvL : urun*kdvH;

        System.out.println("KDV'siz fiyat: "+ urun);
        System.out.println("KDV'li fiyat: " + kdvli);
        System.out.println("KDV tutarı: "+(kdvli-urun));

    }
}
