import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InputHandler {
    public static double[] getCoefficients(Scanner scanner) {
        double[] coefficients = new double[3];
        for (int i = 0; i < 3; i++) {
            coefficients[i] = getValidDouble(scanner, "Coefficient " + (char) ('a' + i));
        }
        return coefficients;
    }

    public static double[] getCoefficientsFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            if (!fileScanner.hasNextLine()) {
                throw new IllegalArgumentException("Error: Empty file.");
            }

            String[] parts = fileScanner.nextLine().split(" ");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Error: Expected 3 numbers in file, got " + parts.length);
            }

            double[] coefficients = new double[3];
            for (int i = 0; i < 3; i++) {
                try {
                    coefficients[i] = Double.parseDouble(parts[i]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Error: Invalid number format in file: " + parts[i]);
                }
            }
            return coefficients;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Error: File not found: " + filename);
        }
    }

    private static double getValidDouble(Scanner scanner, String varName) {
        while (true) {
            System.out.print(varName + " = ");
            String input = scanner.next();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error. Expected a valid real number, got \"" + input + "\" instead.");
            }
        }
    }
}
