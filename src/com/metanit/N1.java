package com.metanit;

import java.util.Scanner;

public class N1 {

    public static long factorialFor(int n) {
        long f = n;
        for (int i = 1; i < n; i++) {
            f *= i;
        }
        return f;
    }

    public static long factorialWhile(int n) {
        long f = n;
        int i = 1;
        while (i < n) {
            f *= i;
            i++;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer n from 0 to 14");
        int n = 0;
        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n < 0 || n >= 15) {
                    System.out.println("Error value!");
                } else {
                    break;
                }
            }
            else {
                System.out.println("Error type!");
                in.next();
            }
        }
        if (n == 0) {
            System.out.println("n! = 1");
        } else {
            System.out.println("n! = " + factorialFor(n) + "    (using for)");
            System.out.println("n! = " + factorialWhile(n) + "    (using while)");
        }
        in.close();
    }
}
