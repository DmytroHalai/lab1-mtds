import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients;

        if (args.length > 0) {
            try {
                coefficients = InputHandler.getCoefficientsFromFile(args[0]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        } else {
            coefficients = InputHandler.getCoefficients(scanner);
        }

        EquationSolver solver = new EquationSolver(coefficients[0], coefficients[1], coefficients[2]);
        solver.solve();
    }
}