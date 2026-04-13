package com.gla.workshop;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;


        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum1 += i;
            }
        }


        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                sum2 += i;
            }
        }


        if (sum1 * m == sum2 * n) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }


    }
}