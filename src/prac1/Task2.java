package prac1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length a: ");
        double a = sc.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.printf("Area: %.2f\nPerimeter: %.2f\nDiagonal: %.2f\n", area, perimeter, diagonal);
    }
}