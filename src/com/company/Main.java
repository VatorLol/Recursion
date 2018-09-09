package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    /*
    * @param n >= 0
    * @return the factoriel of n
    * */
    private static int factoriel(int n){
        if (n == 1 || n == 0)
            return 1;
        else
            return factoriel(n - 1) * n;
    }

    /*
    * @param n >= 0
    * @return the nth fibonacci number
    * */
    private static int fibonacci(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}