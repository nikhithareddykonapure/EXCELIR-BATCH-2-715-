public class Demo016{
    public static void main(String[] args) {
        int a = 5;
        // Post-increment
        System.out.println("Initial value of a: " + a);
        System.out.println("Using a++: " + a++); 
        System.out.println("Value of a after a++: " + a); 
        // Pre-increment
        System.out.println("\nResetting a to 5 ! ");
        a = 5;
        System.out.println("Using ++a: " + ++a); 
        System.out.println("Value of a after ++a: " + a);
    }
}
