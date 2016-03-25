package com.company;

import java.util.Scanner;

public class _05_DecimalToBase7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println(Integer.toString(a, 7));
    }
}
