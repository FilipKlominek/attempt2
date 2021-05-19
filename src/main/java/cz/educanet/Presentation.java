package cz.educanet;

public class Presentation {
    public void instructions() {
        System.out.println("Choose operation");
        System.out.println("0) Exit");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Power");
        System.out.println("6) Factorial");
    }

    public void firstNumberPrompt() {
        System.out.println("Enter first number");
    }

    public void secondNumberPrompt() {
        System.out.println("Enter second number");
    }

    public void basePrompt() {
        System.out.println("Enter base");
    }

    public void exponentPrompt() {
        System.out.println("Enter exponent");
    }
}
