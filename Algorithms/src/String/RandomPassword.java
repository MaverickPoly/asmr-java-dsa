package String;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        String password = generatePassword(length);
        System.out.println("Generated password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length) {
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            builder.append(characters.charAt(Math.abs(random.nextInt() % characters.length())));
        }
        return builder.toString();
    }
}
