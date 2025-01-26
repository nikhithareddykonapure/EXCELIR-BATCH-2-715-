import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a valid letter.");
        }
        scanner.close();
    }
}

