package com.neco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String result="";
            int bTotal =0;
            for(int j=0; j<n; j++ ) {
                bTotal += (int)Math.pow(2, j)*b;
                int total=a+ bTotal;
                result += total +" ";
            }
            System.out.println(result);

        }
        in.close();

    }
}
//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true