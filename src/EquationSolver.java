class EquationSolver {
    private final double a;
    private final double b;
    private final double c;

    public EquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void printEquation(){
        System.out.println("The equation is: (" + a + ") x^2 + (" + b + ") x + (" + c + ") = 0");
    }

    public void solve() {
        printEquation();

        double disc = calcDisc();
        if (disc < 0) {
            System.out.println("There are 0 roots");
        } else if (disc == 0) {
            System.out.println("There is 1 root");
            System.out.println("x1 = " + calcRoot(disc, true));
        } else {
            double x1 = calcRoot(disc, true);
            double x2 = calcRoot(disc, false);
            System.out.println("There are 2 roots");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    private double calcDisc(){
        return b * b - 4 * a * c;
    }

    private double calcRoot(double disc, boolean isFirst){
        double sqrtDisc = isFirst ? -1 * Math.sqrt(disc) : Math.sqrt(disc);
        return (-b + sqrtDisc) / (2 * a);
    }
}