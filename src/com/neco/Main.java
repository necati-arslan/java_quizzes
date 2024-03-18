package com.neco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String data="1 1 1 0 0 0\n" +
            "0 1 0 0 0 0\n" +
            "1 1 1 0 0 0\n" +
            "0 0 2 4 4 0\n" +
            "0 0 0 2 0 0\n" +
            "0 0 1 2 4 0";


    // Complete the hourglassSum function below.
    static int hourglassSum(List<List<Integer>> arr) {
        int max_hourglass = -63; //

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 2; j < arr.get(0).size(); j++) {
                int k = j - 2, hourglass = 0;
                while (k <= j) {
                    hourglass += arr.get(i).get(k) + arr.get(i + 2).get(k);
                    ++k;
                }
                hourglass += arr.get(i + 1).get(j - 1); // Middle value
                max_hourglass = Math.max(hourglass, max_hourglass);
            }
        }
        return max_hourglass;
    }

    public static void main(String[] args) {


        List<List<Integer>> arr = new ArrayList<>();


        String[] rows = data.split("\n");


        for (String row : rows) {
            String[] elements = row.split(" ");

            List<Integer> arrRowItems = new ArrayList<>();
            for (String element : elements) {
                int arrItem = Integer.parseInt(element);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(hourglassSum(arr));





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