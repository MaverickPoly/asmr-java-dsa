package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter a second string: ");
        String string2 = scanner.nextLine();

        if (isAnagram(string1, string2)) {
            System.out.println("Strings are anagram!");
        } else {
            System.out.println("Strings are not anagrams!");
        }

        scanner.close();
    }

    public static boolean isAnagram(String string1, String string2) {
        return strSorted(string1).equals(strSorted(string2));
    }

    public static String strSorted(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
