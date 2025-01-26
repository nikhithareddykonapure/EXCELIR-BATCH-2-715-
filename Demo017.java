import java.util.Scanner;

public class Demo017{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        if (number < 10 || number > 99) {
            System.out.println("Error: Please enter a valid two-digit number.");
        } else {
            int tens = number / 10; 
            int ones = number % 10; 
            int sum = tens + ones;
            System.out.println("The sum of the digits is: " + sum);
        }

        scanner.close();
    }
}