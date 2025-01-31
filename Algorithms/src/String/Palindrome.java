package String;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String string = scanner.nextLine();

        System.out.println(isPalindrome(string) ? "String IS palindrome!" : "String is NOT palindrome!");

        scanner.close();
    }

    public static boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
