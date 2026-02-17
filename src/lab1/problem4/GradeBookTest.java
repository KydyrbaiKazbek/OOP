package lab1.problem4;

import prac2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course("CS101 Object-oriented Programming and Design", "Intro to OOP", 5, "None");
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();
        System.out.println("Please, input grades for students:");

        String[] names = {"Student A", "Student B", "Student C", "Student D", "Student E",
                "Student F", "Student G", "Student H", "Student I", "Student J"};

        for (String name : names) {
            Student s = new Student(name, name+"123");
            System.out.println(name + ":");
            int grade = scanner.nextInt();
            gradeBook.addStudent(s, grade);
        }

        gradeBook.displayGradeReport();
        scanner.close();
    }
}