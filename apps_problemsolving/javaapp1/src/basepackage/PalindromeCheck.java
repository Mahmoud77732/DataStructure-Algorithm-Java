package basepackage;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        checkPalindrome(word);
    }

    public static void checkPalindrome(String word){
        word = word.toLowerCase();
        boolean flag = true;
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}

/*
Q ==> find out whether the given String is Palindrome or not.
*/
