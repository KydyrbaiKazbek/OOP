package prac1;

public class Task1 {
    public static void main(String[] args) {
        String name = "Kazybek";
        String len = "+";
        for (int i = 0; i < name.length() + 2; i++) {
            len += "-";
        }
        len += "+";

        System.out.println(len);
        System.out.println("| " + name + " |");
        System.out.println(len);
    }
}
