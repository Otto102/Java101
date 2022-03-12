import java.util.Scanner;

public class GelismisHesapMak {

    static void sum() {
        Scanner inp = new Scanner(System.in);
        System.out.println("İşlem yapılacak sayıları giriniz. Sonucu görmek için \"0\" giriniz.");
        int number, result = 0, i = 0;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = inp.nextInt();
            result += number;
            if (number ==0) {
                break;
            }
        }
        System.out.println("Sonuç = " + result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        System.out.println("İşlem yapılacak sayıları giriniz. Sonucu görmek için \"0\" giriniz.");
        int number, result = 0, i = 1;

        System.out.print("1. sayı: ");
        number = inp.nextInt();
        result = number;

        while (number != 0){
            i++;
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();
            result -= number;
            System.out.println("Sonuç : " + result);
        }
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.println("İşlem yapılacak sayıları giriniz. Sonucu görmek için \"1\" giriniz.");
        double number, result;
        int i = 1;

        System.out.print("1. sayı: ");
        number = inp.nextInt();
        result = number;

        while (true){
            i++;
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();
            if (number == 0) {
                System.out.println("Bir sayı 0 a bölünemez.");
                break;
            }else if (number == 1){
                System.out.println("Sonuç : " + result);
                break;
            }else {
                result /= number;
                System.out.println("Sonuç : " + result);
            }

        }

    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyelini almak istediğiniz sayıyı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(n+"! = " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mod'u alınacak sayı giriniz: ");
        int n = scan.nextInt();
        System.out.print("Mod katsayısını giriniz: ");
        int m = scan.nextInt();

        while (n>m) {
            n %= m;
        }

        System.out.println("Sonuç : " + n);
    }

    static void area() {
        Scanner scan = new Scanner(System.in);
        int a,b,area, perimeter;
        System.out.print("A kenarı: ");
        a = scan.nextInt();
        System.out.print("B kenarı: ");
        b = scan.nextInt();

        area = a*b;
        perimeter = 2*(a+b);

        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + perimeter);
    }



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int selection, a, b;

        String menu = """
                1- Toplama
                2- Çıkarma
                3- Çarpma
                4- Bölme
                5- Üslü sayı hesaplama
                6- Faktoriyel hesaplama
                7- Mod alma
                8- Dikdörtgen alan ve çevre hesaplama
                0- Çıkış""";

        do {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            selection = inp.nextInt();


            switch (selection) {
                case 1:
                    sum();
                    System.out.println("----------------------------");
                    break;
                case 2:
                    minus();
                    System.out.println("----------------------------");
                    break;
                case 3:
                    times();
                    System.out.println("----------------------------");
                    break;
                case 4:
                    divided();
                    System.out.println("----------------------------");
                    break;
                case 5:
                    power();
                    System.out.println("----------------------------");
                    break;
                case 6:
                    factorial();
                    System.out.println("----------------------------");
                    break;
                case 7:
                    mod();
                    System.out.println("----------------------------");
                    break;
                case 8:
                    area();
                    System.out.println("----------------------------");
                    break;
                case 0:
                    break;
                default:
            }
        } while (selection != 0);

        System.out.print("Uygulama kapatıldı.");

    }
}
