package prac1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Score");
        double score = sc.nextDouble();
        String grade;

        if (score >= 94.5) grade = "A";
        else if (score >= 89.5) grade = "A-";
        else if (score >= 84.5) grade = "B+";
        else if (score >= 79.5) grade = "B";
        else if (score >= 74.5) grade = "B-";
        else if (score >= 69.5) grade = "C+";
        else if (score >= 64.5) grade = "C";
        else if (score >= 59.5) grade = "C-";
        else if (score >= 54.5) grade = "D+";
        else if (score >= 49.5) grade = "D";
        else grade = "F";

        System.out.println("The grade is: " + grade);
    }
}