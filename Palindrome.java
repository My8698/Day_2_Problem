package com.bridgelabz.basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number= scn.nextInt();
        int reverse=0,rem,temp;
        temp=number;
        while (temp!=0)//for finding reverse number
        {
            rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10;
        };
        if(number==reverse)
            System.out.println(number + " is Palindrome");
        else
            System.out.println(number + " is not Palindrome");
    }

}
