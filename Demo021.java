import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = s1.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = s1.nextInt();

        if (a > b) {
            System.out.println("The biggest Number is " + a);
        } else if (b > a) {
            System.out.println("The biggest Number is " + b);
        } else if (a == b) {
            System.out.println("the both numbers are equal");
        }
    }

}