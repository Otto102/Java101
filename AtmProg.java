package Odevler;

// ATM Programı

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 10.01.2022
 */

public class AtmProg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String kullanici, sifre;
        int yanlisParola = 3, islem, miktar, bakiye;
        bakiye = 5000;
        boolean giris = false;
        boolean cikis = false;


        while (yanlisParola>0){
            if(cikis==false) {
                System.out.println("Kullanıcı adınızı giriniz: ");
                kullanici = inp.nextLine();

                System.out.println("Şifrenizi giriniz: ");
                sifre = inp.nextLine();

                if (kullanici.equals("otto")){
                    if (sifre.equals("java101")){
                        giris = true;
                        System.out.println("Başarıyla giriş yaptınız.");
                        while (giris == true) {

                            System.out.print("1- Para Yatırma\n" +
                                    "2- Para Çekme\n" +
                                    "3- Bakie Sorgulama\n" +
                                    "4- Çıkış\n" +
                                    "Yapmak istediğiniz işlemi seçiniz: ");
                            islem = inp.nextInt();

                            switch (islem) {
                                case 1:
                                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                                    miktar = inp.nextInt();
                                    bakiye += miktar;
                                    System.out.println("İşleminiz başarıyla tamamlandı.");
                                    break;
                                case 2:
                                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                                    miktar = inp.nextInt();
                                    bakiye -= miktar;
                                    System.out.println("İşleminiz başarıyla tamamlandı. Paranızı almayı unutmayınız.");
                                    cikis = true;
                                    break;
                                case 3:
                                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                                    break;
                                case 4:
                                    cikis = true;
                                    break;
                            }
                        if (cikis==true){
                            break;
                        }

                        }
                    }else{
                        if (yanlisParola == 0){
                            System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                        }else {
                            System.out.println("Yanlış parola girdiniz. Kalan hakkınız:" + (yanlisParola - 1));
                            yanlisParola--;
                        }
                    }
                }else {
                    System.out.println("Kullanıcı adı geçersiz. Tekrar deneyiniz.");

                }
            }else {
                System.out.print("Başarıyla çıkış yaptınız. Kartınızı almayı unutmayınız.");
                break;
            }
            }
    }
}
