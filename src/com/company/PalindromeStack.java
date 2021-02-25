package com.company;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {

    public static void main(String[] args) {

        System.out.println("Enter any string you like for Palindrome check");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

//        String str = "Mom";
//        String str = "Was it a car or a cat I saw?";
//        String inputStr = "Madam, in Eden, I'm Adam.";
//        String str = "Yo, banana boy!";

        Stack<Character> stack = new Stack<>();

        String inputStrLettersOnly = convertToLettersOnly(inputStr);

        for (int i = 0; i < inputStrLettersOnly.length(); i++) {
            stack.push(inputStrLettersOnly.charAt(i));
        }

        String reverseInputStrLettersOnly = "";

        while (!stack.isEmpty()) {
            reverseInputStrLettersOnly = reverseInputStrLettersOnly + stack.pop();
        }

        if (inputStrLettersOnly.equals(reverseInputStrLettersOnly))
            System.out.println("Yes, it is palindrome.");
        else
            System.out.println("No, it isn't palindrome.");
    }

    public static String convertToLettersOnly(String inputStr) {

        inputStr = inputStr.toLowerCase();

        return inputStr.replaceAll("[^a-z]", "");
    }

    // Palindrome check with loop:
    /*public static boolean isPalindrome(String strLettersOnly) {

        int i = 0;
        int j = strLettersOnly.length() - 1;
        while (i < j) {
            if (strLettersOnly.charAt(i) != strLettersOnly.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }*/
}
