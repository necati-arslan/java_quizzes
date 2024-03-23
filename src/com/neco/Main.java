package com.neco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> myList = new ArrayList<>();

        for (int i=0;i<n;i++){
            int ElementinL=in.nextInt();
            myList.add(ElementinL);
        }

        int q = in.nextInt();
        for(int j=0;j<q;j++){
            String input = in.next();

            if (input.equals("Insert")){
                int first=in.nextInt();
                int sec=in.nextInt();
                myList.add(first,sec);
            }

            if(input.equals("Delete")){
                int indexDelete=in.nextInt();
                myList.remove(indexDelete);
            }

        }

        for(int e:myList){
            System.out.print(e + " ");

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