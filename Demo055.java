import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; 
            sum += digit * digit; 
            number /= 10; 
        }
        System.out.println("Sum of squares of digits: " + sum);
        
        scanner.close();
    }
}
