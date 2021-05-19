package cz.educanet;

public class Logic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int power(int base, int exponent) {
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= base;
        }
        return power;
    }

    public int factorial(int base) {
        int factorial = 1;
        for (int i = base; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
