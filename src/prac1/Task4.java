package prac1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.err.println("The discriminant is negative. No real roots.");
        } else {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}