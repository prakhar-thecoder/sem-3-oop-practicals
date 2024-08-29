import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (max 80 characters): ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() > 80) {
            System.out.println("Input string is too long. Maximum 80 characters allowed.");
            return;
        }

        if (!input.endsWith(".")) {
            System.out.println("Input string must end with a full stop.");
            return;
        }

        String[] words = input.substring(0, input.length() - 1).split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(b.length(), a.length());
            }
        });

        StringBuilder output = new StringBuilder();
        for (String word : words) {
            output.append(word).append(" ");
        }
        output.deleteCharAt(output.length() - 1).append(".");

        System.out.println(output);

        try (FileWriter writer = new FileWriter("P5B.txt")) {
            writer.write(output.toString());
            System.out.println("Output written to file");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}