import java.util.Scanner;

public class Demo12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);
        scanner.close();
    }
}
