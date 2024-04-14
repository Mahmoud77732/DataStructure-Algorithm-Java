package challanges.pk1;

import java.util.Scanner;

public class SubtractProductAndSumDigitsNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, product = 1, subtractResult = 0;
        int number = input.nextInt();
        String numString = number + "";
        for(int i = 0; i < numString.length(); i++){
            int curDigit = Integer.parseInt(numString.charAt(i) + "");
            sum += curDigit;
            product *= curDigit;
        }
        subtractResult = product - sum;
        System.out.println("subtract of  product and sum of digits = " + subtractResult);
    }
}
