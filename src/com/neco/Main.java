package com.neco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character

        String s = scan.nextLine();

        scan.close();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
