public class LTCODE0002 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        LTCODE0002 solution = new LTCODE0002();
        System.out.println(solution.reverse(123));     // Output: 321
        System.out.println(solution.reverse(-123));    // Output: -321
        System.out.println(solution.reverse(120));     // Output: 21
    }
}