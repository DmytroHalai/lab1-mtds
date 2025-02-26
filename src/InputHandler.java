import java.util.Scanner;

class InputHandler {
    public static double[] getCoefficients(Scanner scanner) {
        double[] coefficients = new double[3];
        for (int i = 0; i < 3; i++) {
            coefficients[i] = getValidDouble(scanner, "Coefficient " + (char) ('a' + i));
        }
        return coefficients;
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
