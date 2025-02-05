public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        long first = 0, second = 1;
        System.out.println("Fibonacci Series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
