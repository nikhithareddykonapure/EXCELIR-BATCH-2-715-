import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        String Name;
        long PhNo;
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter PhNo: ");
        PhNo = sc.nextLong();
        System.out.print("Enter Age: ");
        Age = sc.nextInt();
        System.out.println("Name: " + Name);
        System.out.println("Phone Number: " + PhNo);
        System.out.println("Age: " + Age);
        System.out.println("Welcome !! ");
        sc.close();
    }
}