package com.bridgelabz.basics;
public class SumOfCommandLineArgs {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("Sum->"+c);
    }
}
