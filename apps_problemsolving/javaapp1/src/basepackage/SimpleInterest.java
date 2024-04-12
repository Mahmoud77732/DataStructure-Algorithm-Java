package basepackage;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        // Simple Interest = (P × R × T) / 100
        Scanner input = new Scanner(System.in);
        float principal, time, rate, result;
        principal = input.nextFloat();
        time = input.nextFloat(); // years
        rate = input.nextFloat();
        result = (principal * time * rate) / 100;
        System.out.println("Simple Interest = " + result);

    }
}

/*
Q==> Write a program to input principal, time, and rate (P, T, R) from the user and
    find Simple Interest.

---------------------------------------

* Simple Interest is the convenient method used in banking and economic sectors
    to calculate the interest charges on loans.It gets estimated day to day
    with the help of some mathematical terms.

* Simple Interest = (P × R × T) / 100
  where P = Principal Amount, R = Rate per Annum, T = Time (years)
*/
