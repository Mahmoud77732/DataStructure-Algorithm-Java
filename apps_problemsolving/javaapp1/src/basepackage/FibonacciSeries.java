package basepackage;

import java.util.Scanner;

public class FibonacciSeries {
    public static int num1 = 0, num2 = 1, nextNum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        System.out.print(num1+" "+num2);//printing 0 and 1
        // findFibonacciUntil(limit);
        findFibonacciUntilRecursion(limit - 2);
    }

    public static void findFibonacciUntil(int limit){
        for(int i = 2; i < limit; i++){
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }

    public static void findFibonacciUntilRecursion(int count){
        if(count > 0){
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
            findFibonacciUntilRecursion(count - 1);
        }
    }
}

/*
Q ==> calculate Fibonacci Series up to n numbers.

* In fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of fibonacci series are 0 and 1.
*/
