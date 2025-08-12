package com.epam.bitwise;

public class Main {
    public static void main(String[] args) {
        defaultTask();
        defaultTask2();
        defaultTask3();
    }

    private static void defaultTask() {
        // XOR if only 1 TRUE
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultA = a ^ b;
        System.out.println(resultA);


        boolean resultB = a ^ c;
        System.out.println(resultB);
    }

    private static void defaultTask2() {
        // AND if BOTH TRUE
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultA = a & b;
        System.out.println(resultA);


        boolean resultB = a & c;
        System.out.println(resultB);
    }

    private static void defaultTask3() {
        // OR if only 1 TRUE
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultA = a | b;
        System.out.println(resultA);


        boolean resultB = a | c;
        System.out.println(resultB);
    }
}
