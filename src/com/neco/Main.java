package com.neco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1; //

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++; //
        }




    }//main
}
//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true