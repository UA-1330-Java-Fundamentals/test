package homework2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scan.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = scan.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    scan.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                scan.close();
                return;
        }

        System.out.println("Result: " + result);
        scan.close();
    }
}
