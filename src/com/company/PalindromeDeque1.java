package com.company;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;

public class PalindromeDeque1 {
    public static boolean palindromeArrayDeque(String str) {
        String inputStr = str.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < inputStr.length(); i++) {
            deque.add(inputStr.charAt(i));
        }
        String reverseStr = "";

        Iterator iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            reverseStr = reverseStr + iterator.next();
        }
        return inputStr.equals(reverseStr);
    }

    public static boolean palindromeArrayBlockingQueue(String str) {
        String inputStr = str.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
        ArrayBlockingQueue<Character> queue = new ArrayBlockingQueue<Character>(inputStr.length());
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            queue.add(inputStr.charAt(i));
        }
        String reverseStr = "";

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            reverseStr = reverseStr + iterator.next();
        }
        return inputStr.equals(reverseStr);
    }

    public static void main(String[] args) {

        String one = "Mom";
        String two = "Was it a car or a cat I saw?";
        String three = "Madam, in Eden, I'm Adam.";
        String four = "Yo, banana boy!";
        String five = "Sapals arī tad ēda tīras lapas.";
        String six = "Ana voli Milovana.";
        String end = "It's time to finish this task!!!";

        System.out.println("Are these sentences palindromes: ");
        System.out.format("'%s' : " + palindromeArrayDeque(one), one);
        System.out.format("\n'%s' : " + palindromeArrayDeque(two), two);
        System.out.format("\n'%s' : " + palindromeArrayDeque(three), three);
        System.out.format("\n'%s' : " + palindromeArrayDeque(four), four);
        System.out.format("\n'%s' : " + palindromeArrayDeque(five), five);
        System.out.format("\n'%s' : " + palindromeArrayDeque(six), six);
        System.out.format("\n'%s' : " + palindromeArrayDeque(end), end);

        System.out.println("\n");
        System.out.println("Are these sentences palindromes: ");
        System.out.format("'%s' : " + palindromeArrayBlockingQueue(one), one);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(two), two);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(three), three);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(four), four);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(five), five);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(six), six);
        System.out.format("\n'%s' : " + palindromeArrayBlockingQueue(end), end);

    }
}
