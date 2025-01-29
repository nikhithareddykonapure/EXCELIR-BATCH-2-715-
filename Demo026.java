import java.util.Scanner;

public class Demo026 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s1.nextLine();
        String n = input.toLowerCase();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
