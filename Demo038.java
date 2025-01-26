import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } else {
            System.out.println("The input is not an alphabetic character.");
        }

        scanner.close();
    }
}

