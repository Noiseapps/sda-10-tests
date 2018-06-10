package pl.sda.tests;

public class QuadraticEquation {

    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    double[] getSolutions() {
        double[] solutions = null;
        double delta = getDelta();
        if (delta > 0) {
            solutions = new double[2];
            solutions[0] = (-b - Math.sqrt(delta)) / (2 * a);
            solutions[1] = (-b + Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            solutions = new double[1];
            solutions[0] = (-b) / (2 * a);
        }
        return solutions;
    }
}
