package com.neco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = in.nextInt();
        for(int i=0; i<n ;i++){
            List<Integer> line = new ArrayList<Integer>();
            int d = in.nextInt();
            for(int j=0; j<d;j++){
                line.add(in.nextInt());
            }
            lines.add(line);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {

            int x = in.nextInt();
            int y = in.nextInt();
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }

        }
        in.close();






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