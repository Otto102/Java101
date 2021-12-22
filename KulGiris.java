package Odevler;

// UI Login

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class odev9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password, resetPass, newPass;
        System.out.print("Kullanıcı adınızı giriniz: ");
        username = inp.nextLine();
        System.out.print("Parolanızı giriniz: ");
        password = inp.nextLine();

        if (username.equals("otto102") && password.equals("sifre2021")) {
            System.out.print("Giriş yaptınız!");
        } else if (username.equals("otto102")) {
            System.out.println("Parolanızı hatalı girdiniz!");
            System.out.println("Parolanızı sıfırlamak ister misiniz? Evet/Hayır");
            resetPass = inp.nextLine();
            if (resetPass.equals("Evet") || resetPass.equals("evet")) {
                System.out.print("Yeni parola giriniz: ");
                newPass = inp.nextLine();
                if (newPass.equals(password) || newPass.equals("sifre2021")) {
                    System.out.print("Yeni parolanız eski parolanız ile aynı olamaz! Lütfen farklı bir parola giriniz.");
                } else {
                    System.out.print("Parolanız başarıyla değiştirildi!");
                }
            }
        } else if (password.equals("sifre2021")) {
            System.out.print("Kullanıcı adı tanımsız!");
        }

    }
}
