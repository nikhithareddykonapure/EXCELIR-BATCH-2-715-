import java.util.Scanner;
public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, 3);
            number /= 10; 
        }
        
        System.out.println("Sum of cubes of the digits: " + sum);
    }
}
