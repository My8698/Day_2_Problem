package com.bridgelabz.basics;

public class SumOfNumUsingWhile {
    public static void main(String[] args) {
        int i=1,num=5,sum=0;
        while (i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 5 natural numbers is->"+sum);
    }
}
