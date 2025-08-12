package com.epam.operators;

public class Main {
    public static void main(String[] args) {
        defaultTask();
        defaultTask2();
    }

    private static void defaultTask() {
        // left always FALSE
        int a = 1;
        int b = -1;

        boolean resultA = a > 0 && a < 5;  // look right
        System.out.println(resultA);


        boolean resultB = b > 0 &&  b < 5;
        System.out.println(resultB);
    }

    private static void defaultTask2() {
        // left always TRUE
        int a = 1;
        int b = -1;

        boolean resultA = a > 0 || a == 5;
        System.out.println(resultA);


        boolean resultB = b > 0 ||  b > 5; // look right
        System.out.println(resultB);
    }
}
