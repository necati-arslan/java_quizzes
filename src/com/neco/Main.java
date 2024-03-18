package com.neco;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a =new int[n];

        for (int j=0; j<n;j++){
            int v= scan.nextInt();
            a[j]=v;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }//main
}

/*
* public class MyClass {
    private static int number;

    static {
        init(); // Statik başlatma bloğu içinde metodu çağırıyoruz
    }

    private static void init() {
        // Static initialization method
        System.out.println("Static initialization method is executed.");
        number = 10;
    }

    public static void main(String[] args) {
        // Accessing static variable after static initialization method
        System.out.println("Number: " + number);
    }
}
* */