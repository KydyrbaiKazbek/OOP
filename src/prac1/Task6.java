package prac1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String to check: ");
        String input = sc.nextLine();
        int len = input.length();
        boolean ans = true;
        for (int i = 0; i < len/2; i++){
            if (input.charAt(i)!=input.charAt(len-1-i)){
                System.out.print("Not a palindrome");
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.print("It is palindrome");
        }
    }
}