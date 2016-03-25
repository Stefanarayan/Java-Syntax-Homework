package com.company;

import java.util.Scanner;

public class _01_RectangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(RectangleArea(a, b));
    }

    private static int RectangleArea (int x, int y) {
        int result = x * y;
        return result;
    }
}
