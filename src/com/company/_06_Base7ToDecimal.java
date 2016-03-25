package com.company;

import java.util.Scanner;

public class _06_Base7ToDecimal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int a = Integer.valueOf(str, 7);
        System.out.println(a);

    }
}
