
import java.util.Scanner;

public class InputValidator {

    public static String getStringInput(Scanner scanner, String prompt) {
        String input;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();

            if (!isNumber(input)) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a string without numbers.");
            }
        }

        return input;
    }

    public static String getCharInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();

            if (input.length() == 1 && (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("G"))) {
                return input.toUpperCase();
            } else {
                System.out.println("Invalid input. Please enter a single character: 'M' or 'G'.");
            }
        }
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

