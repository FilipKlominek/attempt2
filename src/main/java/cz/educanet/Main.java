package cz.educanet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Logic logic = new Logic();
        Presentation presentation = new Presentation();

        while (true) {

            presentation.instructions();

            int mode = sc.nextInt();
            if (mode == 0) {
                break;
            } else if (mode == 1) {
                presentation.firstNumberPrompt();
                int a = sc.nextInt();
                presentation.secondNumberPrompt();
                int b = sc.nextInt();
                System.out.println(a + " + " + b + " = " + logic.add(a, b));
            } else if (mode == 2) {
                presentation.firstNumberPrompt();
                int a = sc.nextInt();
                presentation.secondNumberPrompt();
                int b = sc.nextInt();
                System.out.println(a + " - " + b + " = " + logic.subtract(a, b));
            } else if (mode == 3) {
                presentation.firstNumberPrompt();
                int a = sc.nextInt();
                presentation.secondNumberPrompt();
                int b = sc.nextInt();
                System.out.println(a + " * " + b + " = " + logic.multiply(a, b));
            } else if (mode == 4) {
                presentation.firstNumberPrompt();
                int a = sc.nextInt();
                presentation.secondNumberPrompt();
                int b = sc.nextInt();
                System.out.println(a + " / " + b + " = " + logic.divide(a, b));
            } else if (mode == 5) {
                presentation.basePrompt();
                int a = sc.nextInt();
                presentation.exponentPrompt();
                int b = sc.nextInt();
                System.out.println(a + "^" + b + " = " + logic.power(a, b));
            } else if (mode == 6) {
                presentation.basePrompt();
                int a = sc.nextInt();
                System.out.println(a + "!" + " = " + logic.factorial(a));
            }
        }
    }
}
