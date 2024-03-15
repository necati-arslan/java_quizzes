package com.neco;
import java.util.Scanner;

public class Main {
    // Static Initialization Blocks
    static int B,H;
    static boolean flag;

    static{
        Scanner scan=new Scanner(System.in);
        B=scan.nextInt();
        H=scan.nextInt();
        if(B>0&&H>0){
            flag=true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {

        if(flag){
            int area=B*H;
            System.out.print(area);
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