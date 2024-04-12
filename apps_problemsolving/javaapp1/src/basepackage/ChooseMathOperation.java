package basepackage;

import java.util.Scanner;

public class ChooseMathOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operator = input.next();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        switch (operator) {
            case "+" -> System.out.println("num1 + num2 = " + (num1 + num2));
            case "-" -> System.out.println("num1 - num2 = " + (num1 - num2));
            case "*" -> System.out.println("num1 * num2 = " + (num1 * num2));
            case "/" -> System.out.println("num1 / num2 = " + (num1 / num2));
        }
    }
}

/*
Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
*/
