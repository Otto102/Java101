package Odevler;

// Recursive Metot ile Fibonacci serisi bulan program

import java.util.Scanner;

/**
 * @author Osman Kurun
 * @since 17.01.2022
 */

public class FibonacciMetot {
    static int fib(int n) {
        if (n==1 || n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, i;
        System.out.print("Fibonacci serisini kaç kere hesaplamak istiyorsunuz? ");
        a = inp.nextInt();
        for (i=1; i<=a; i++){
            System.out.print(fib(i)+" ");
        }

    }

}
