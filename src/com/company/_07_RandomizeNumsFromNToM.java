package com.company;

import java.util.Random;
import java.util.Scanner;

public class _07_RandomizeNumsFromNToM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int minimum = Math.min(n, m);
        int maximum = Math.max(n, m);

        Random rand = new Random();
        for (int i = minimum; i <= maximum; i++) {
            int randNum = rand.nextInt((maximum - minimum) + 1) + minimum;
            System.out.print(randNum + " ");
        }
    }
}
