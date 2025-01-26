import java.util.Scanner;

public class Demo018{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 100 == 0) {
            System.out.println(number + " is a multiple of 100.");
        } else {
            System.out.println(number + " is not a multiple of 100.");
        }

        scanner.close(); // Close the scanner
    }
}

