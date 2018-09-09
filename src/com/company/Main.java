package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factoriel(0));
    }

    private static int factoriel(int n){

        if (n == 1 || n == 0)
            return 1;
        else
            return factoriel(n - 1) * n;

    }
}