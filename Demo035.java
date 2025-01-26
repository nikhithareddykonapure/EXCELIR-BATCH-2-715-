import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " is the bigger number.");
        } else if (number2 > number1) {
            System.out.println(number2 + " is the bigger number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}

