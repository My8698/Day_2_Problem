package com.bridgelabz.basics;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number= scanner.nextInt();
        int reverse=0,remainder,temporary;
        temporary=number;
        while (temporary!=0)//for finding reverse number
        {
            remainder=temporary%10;
            reverse=reverse*10+remainder;
            temporary/=10;
        };
        if(number==reverse)
            System.out.println(number + " is Palindrome");
        else
            System.out.println(number + " is not Palindrome");
    }

}
