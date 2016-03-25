package com.company;

import java.util.Scanner;

public class _04_CalculateExpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();
        double result1 = FormulaOne(a, b, c);
        double result2 = FormulaTwo(a, b, c);
        double difference = Difference(a, b, c, FormulaOne(a, b, c), FormulaTwo(a, b, c));

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", result1, result2, difference);

    }

    private static double FormulaOne (double x, double y, double z) {
        double power = (x + y + z) / Math.sqrt(z);
        double result = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)) / (Math.pow(x, 2) - Math.pow(y, 2)), power);
        return result;
    }

    private static double FormulaTwo (double x, double y, double z) {
        double power = x - y;
        double result = Math.pow((Math.pow(x, 2) + Math.pow(y, 2) - Math.pow(z, 3)), power);
        return result;
    }

    private static double Difference (double x, double y, double z, double m, double n) {
        double result1 = (x + y + z) / 3;
        double result2 = (m + n) / 2;
        return Math.abs(result1 - result2);

    }
}
