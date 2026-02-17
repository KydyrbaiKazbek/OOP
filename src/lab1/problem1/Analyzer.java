package lab1.problem1;

import java.util.Scanner;


public class Analyzer {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Data data = new Data();
        while (true){
            System.out.print("Enter number (Q to quit): ");
            String number = input.nextLine();
            if (number.contains("Q")){break;}
            try {
                double num = Double.parseDouble(number);
                data.add(num);
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        System.out.printf("Average = %f%n", data.average());
        System.out.printf("Maximum = %f%n", data.max());
    }
}
