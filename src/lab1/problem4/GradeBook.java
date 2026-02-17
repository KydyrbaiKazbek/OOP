package lab1.problem4;

import prac2.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private HashMap<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student, int grade) {
        students.add(student);
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        determineClassAverage();
        findMinMax();
        outputBarChart();
    }

    private void determineClassAverage() {
        if (grades.isEmpty()) return;
        double total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        System.out.printf("Class average is %.2f. ", total / grades.size());
    }

    private void findMinMax() {
        if (grades.isEmpty()) return;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Student maxStudent = null;
        Student minStudent = null;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxStudent = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minStudent = entry.getKey();
            }
        }
        System.out.println("Lowest grade is " + min + " (" + minStudent + "). Highest grade is " + max + " (" + maxStudent + ").");
    }

    private void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] frequency = new int[11];

        for (int grade : grades.values()) {
            if (grade == 100) frequency[10]++;
            else frequency[grade / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}