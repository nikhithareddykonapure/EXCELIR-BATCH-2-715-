public class LTCODE0003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, index = 0, result = 0;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index++) == '-') ? -1 : 1;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index++) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }

        return result * sign;
    }


    public static void main(String[] args) {
        LTCODE0003 atoi = new LTCODE0003();

        // Test cases
        System.out.println(atoi.myAtoi("42")); 
        System.out.println(atoi.myAtoi("   -42")); 
        System.out.println(atoi.myAtoi("4193 with words")); 
        System.out.println(atoi.myAtoi("words and 987"));
        System.out.println(atoi.myAtoi("-91272332")); 
    }
}

