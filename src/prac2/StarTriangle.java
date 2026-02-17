package prac2;

import java.util.Scanner;

public class StarTriangle {
    private int width;
    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= this.width; i++) {
            ans.append("[*]".repeat(i)).append('\n');
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        StarTriangle small = new StarTriangle(a);
        System.out.println(small);
    }
}
