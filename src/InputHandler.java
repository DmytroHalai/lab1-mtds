import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InputHandler {
    static final int ARGS_AMOUNT = 3;
    public static double[] getCoefficients(Scanner scanner) {
        double[] coefficients = new double[ARGS_AMOUNT];
        for (int i = 0; i < ARGS_AMOUNT; i++) {
            coefficients[i] = getValidDouble(scanner, "Coefficient " + (char) ('a' + i));
        }
        return coefficients;
    }

    public static double[] getCoefficientsFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            if (!fileScanner.hasNextLine()) {
                throw new IllegalArgumentException("Error: Empty file.");
            }

            String[] parts = fileScanner.nextLine().trim().split("\\s+");
            if (parts.length != ARGS_AMOUNT) {
                throw new IllegalArgumentException("Error: Expected " + ARGS_AMOUNT + " numbers in file, got " + parts.length);
            }

            return parseCoefficients(parts);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Error: File not found: " + filename);
        }
    }

    private static double[] parseCoefficients(String[] parts) {
        double[] coefficients = new double[ARGS_AMOUNT];
        for (int i = 0; i < ARGS_AMOUNT; i++) {
            coefficients[i] = checkValidInput(parts[i]);
        }
        return coefficients;
    }

    private static double getValidDouble(Scanner scanner, String varName) {
        while (true) {
            System.out.print(varName + " = ");
            String input = scanner.next();
            try {
                return checkValidInput(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Try again.");
            }
        }
    }

    private static double checkValidInput(String input){
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error. Expected a valid real number, got \"" + input + "\" instead.");
        }
    }
}
