package prac3.problem2;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static final Vector<Object> data = new Vector<>();
    private static final Scanner sc = new Scanner(System.in);
    private static Boolean run = true;


    static void main(String[] args){
        while(run){
            System.out.print("""
                    Available commands: 
                    1. "Add Person"
                    2. "Add Student"
                    3. "Add Employee"
                    4. "Info"
                    5. "Q" - exit the program
                    Enter command: """);
            String input = sc.nextLine();
            switch (input.toLowerCase()){
                case "add person": addPerson(); break;
                case "add student": addStudent(); break;
                case "add employee": addEmployee(); break;
                case "info": info(); break;
                case "q": run=false; break;
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }
    private static String[] getInput(String format, int args_count){
        System.out.printf("Enter information in the following format \"%s\":", format);
        String[] parts = sc.nextLine().split("\\s+");
        if(parts.length != args_count){
            throw new IllegalArgumentException("Wrong number of arguments");
        }
        return parts;
    }

    private static void addPerson(){
        String[] parts = getInput("name address", 2);
        data.add(new Person(parts[0], parts[1]));
    }
    private static void addStudent(){
        String[] parts = getInput("name address program year_of_study fee", 5);
        data.add(new Student(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Double.parseDouble(parts[4])));
    }
    private static void addEmployee(){
        String[] parts = getInput("name address school/faculty pay/salary", 4);
        data.add(new Staff(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
    }

    private static void info(){
        int count = 1;
        if (data.isEmpty()){
            System.out.println("There are no records. Add a new record.\n");
        }
        for (Object d : data){
            System.out.print(count + ") ");
            System.out.println(d);
            count++;
        }
    }
}
