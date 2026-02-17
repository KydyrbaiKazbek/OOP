package prac1;

public class Task5 {
    public static void main(String[] args) {
        double initialBalance = 2000000;
        double interestRate = 0.20;

        double newBalance = initialBalance*(1+interestRate);

        System.out.println("Initial Balance: " + initialBalance + " ₸");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("New Balance: " + newBalance + " ₸");
    }
}