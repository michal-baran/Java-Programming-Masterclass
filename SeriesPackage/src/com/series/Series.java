package com.series;

public class Series {
    public static int nSum(int n) {
        if (n != 0) {
            return n + nSum(n - 1);
        } else {
            return 0;
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

