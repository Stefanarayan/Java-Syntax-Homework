package com.company;

import java.util.Scanner;

public class _02_TriangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xA = scan.nextInt();
        int yA = scan.nextInt();
        int xB = scan.nextInt();
        int yB = scan.nextInt();
        int xC = scan.nextInt();
        int yC = scan.nextInt();

        System.out.println(TriangleArea(xA, yA, xB, yB, xC, yC));

    }

    private static int TriangleArea (int xA, int yA, int xB, int yB, int xC, int yC){
        int area = ( (xA*(yB - yC) + xB*(yC - yA) + xC*(yA - yB)) / 2 );
        if (area < 0){
            return Math.abs(area);
        }
        else return area;

    }
}

