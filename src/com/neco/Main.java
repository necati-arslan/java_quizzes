package com.neco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*ava has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.*/

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long n=sc.nextLong();
                System.out.println(n+" can be fitted in:");
                if (n >= -128 && n <= 127)
                    System.out.println("* byte");
                if (n >= -32768 && n <= 32767)
                    System.out.println("* short");
                if (n >= -2147483648 && n <= 2147483647)
                    System.out.println("* int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }






    }//main
}
//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true