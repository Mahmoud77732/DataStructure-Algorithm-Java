package basepackage;

import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println((num+"").length());
        checkArmstrong(num);
    }

    public static void checkArmstrong(int num){
        String numString = num + "";
        double result = 0;
        for(int i=0; i<numString.length(); i++){
            // 371 = (3 * 3 * 3) + (7 * 7 * 7) + (1 * 1 * 1) = 371 --> armstrong number
            // 1634 = (1 * 1 * 1 * 1) + (6 * 6 * 6 * 6) + (3 * 3 * 3 * 3) + (4 * 4 * 4 *4) = 1634
            result += Math.pow(Integer.parseInt(numString.charAt(i)+""), numString.length());
        }
        if(num == result){
            System.out.println(num + " is an armstrong number");
        }
        else{
            System.out.println(num + " is not an armstrong number");
        }
    }
}

/*
Q ==> find Armstrong Number between two given number

* An integer is referred to as the Armstrong numbers of the order n.
    When it's each digit is separated, cubed, and added together
    then it will result in a sum that is the same as the number, (i.e., pqrs... = p^n + q^n + r^n + s^n +...).
    ex:
    ---
    371 = 3 * 3 * 3 + 7 * 7 * 7 + 1 * 1 * 1
    = 27 + 343 + 1
    = 371
    Therefore, 371 is an Armstrong number.
*/
