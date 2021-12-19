package Odevler;

// Hava Sıcaklığına Göre Etkinlik Önerme

import java.util.Scanner;

/**
 * @author Osman Kurun - 19.12.2021
 */

public class odev11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklığı kaç derece?");
        int hava = inp.nextInt();
        if (hava<5) {
            System.out.print("Kayak yapabilirsiniz.");
        }else if (hava<=15){
            if (hava>10){
                System.out.print("Pikniğe veya sinemaya gidebilirsiniz.");
            }else {
                System.out.print("Sinemaya gidebilirsiniz.");
            }
        }else if (hava<=25){
            System.out.print("Pikniğe gidebilirsiniz.");
        }else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }


}
