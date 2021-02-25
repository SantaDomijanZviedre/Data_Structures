package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class PalindromeQueue {

    public static void main(String[] args) {

//        System.out.println("Enter any string you like for Palindrome check");
//        Scanner in = new Scanner(System.in);
//        String inputStr = in.nextLine();

//        String str = "Mom";
//        String str = "Was it a car or a cat I saw?";
        String inputStr = "Madam, in Eden, I'm Adam.";
//        String str = "Yo, banana boy!";

        Queue<Character> queue = new LinkedList<>();

        String inputStrLettersOnly = convertToLettersOnly(inputStr);

        for (int i = inputStrLettersOnly.length() - 1; i >= 0; i--) {
            queue.add(inputStrLettersOnly.charAt(i));
        }

        String reverseInputStrLettersOnly = "";

        while (!queue.isEmpty()) {
            reverseInputStrLettersOnly = reverseInputStrLettersOnly + queue.remove();
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
}
