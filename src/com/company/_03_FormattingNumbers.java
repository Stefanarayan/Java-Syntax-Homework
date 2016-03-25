package com.company;

import java.util.Scanner;

public class _03_FormattingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|", a, String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'), b, c);

    }
}
