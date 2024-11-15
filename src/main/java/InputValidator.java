import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    // Method to get an integer from the user
    public static String getStringInput(Scanner scanner, String prompt) {
        String input;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();  // Read the whole line as a string

            if (!isNumber(input)) {  // Assuming isNumber() checks if the string is a number
                break;  // Exit loop if input is a valid string (not a number)
            } else {
                System.out.println("Invalid input. Please enter a string without numbers.");
            }
        }

        return input;  // Return the valid string
    }

    public static String getCharInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            try {
                System.out.print(prompt);
                if (scanner.hasNext()) {
                    input = String.valueOf(scanner.next().charAt(0));
                    break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a single character.");
                scanner.nextLine();  // Clear the invalid input


            }

        }
        return input;  // Return the valid integer
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

