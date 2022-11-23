package com.bridgelabz.basics;
import java.util.Scanner;
public class VowelConsonantUsingSwitch {
    public static void main(String[] args) {
        boolean bool=false;
        System.out.println("Enter character->");
        Scanner scanner=new Scanner(System.in);
        char choice=scanner.next().charAt(0);
        switch (choice){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': bool=true;
        }
        if (bool==true){
            System.out.println("Given character is Vowel");
        }
        else{
            System.out.println("given Character is Consonant");
        }
    }
}
