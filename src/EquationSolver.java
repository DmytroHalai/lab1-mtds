class EquationSolver {
    private double a;
    private double b;
    private double c;

    public EquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        System.out.println("The equation is: (" + a + ") x^2 + (" + b + ") x + (" + c + ") = 0");

        double disc = b * b - 4 * a * c;
        if (disc < 0) {
            System.out.println("There are 0 roots");
        } else if (disc == 0) {
            System.out.println("There is 1 root");
            System.out.println("x1 = " + (-b) / (2 * a));
        } else {
            double x1 = (-b - Math.sqrt(disc)) / (2 * a);
            double x2 = (-b + Math.sqrt(disc)) / (2 * a);
            System.out.println("There are 2 roots");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}