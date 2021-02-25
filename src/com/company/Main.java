package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("Computer");
        words.add("Plate");
        words.add("Girl");
        words.add("Cat");
        words.add("Shirt");
        words.add("Determination");
        words.add("Category");
        words.add("Kaķis");
        words.add("1Cake");
        words.add("5Cakes");
        words.add("Ķēms");

        System.out.println(words);

        System.out.println("\nThere are " + startingC(words) + " words starting with 'C'.\n");
        endingE(words);
        System.out.println("\nThere are " + length5(words) + " words 5 characters long. \n");
        System.out.println("There are " + howManyValuesWithE(words) + " words containing character 'e'.\n");

        System.out.println("These " + subStringTe(words) + " words contain substring 'te'.\n");

        System.out.println("Histogram of words related to their length: ");
        histogram(words);

        // sortByFirstLetter(words);
        System.out.println("\nValues sorted by the first letter: ");
        Collections.sort(words);
        for (String i : words) {
            System.out.println(i);
        }
    }

    public static int startingC(ArrayList<String> words) {

        int counter = 0;
        for (String s : words) {
            if (s.startsWith("C")) {
                counter++;
            }
        }
        return counter;
    }

    public static void endingE(ArrayList<String> words) {

        int counter = 0;
        for (String s : words) {
            if (s.endsWith("e")) {
                counter++;
                String output = counter < 2 ? "There is " + counter + " word ending with 'e'." :
                        "There are " + counter + " words ending with 'e'.";
                System.out.println(output);

            }
        }
    }

    public static int length5(ArrayList<String> words) {

        int counter = 0;
        for (String s : words) {
            if (s.length() == 5) {
                counter++;
            }
        }
        return counter;
    }

    public static int howManyValuesWithE(ArrayList<String> words) {

        int counter = 0;
        for (String s : words) {
            if (s.contains("e")) {
                counter++;
            }
        }
        return counter;
    }

    public static int subStringTe(ArrayList<String> words) {

        int counter = 0;
        for (String value : words) {

            Pattern p = Pattern.compile("\\s*te\\s*");
            Matcher m = p.matcher(value);

            if (m.find()) {
                System.out.println(value);
                counter++;
            }
        }
        return counter;
    }

    public static void histogram(ArrayList<String> words) {

        int[] lengthOfWords = new int[14];

        for (int i = 0; i < lengthOfWords.length; i++) {
            int counter = 0;
            for (String s : words) {
                if (i == s.length()) {
                    counter++;
                }
            }
            lengthOfWords[i] = counter;
            if (counter != 0 && counter < 2) {
                System.out.println("There is 1 word that consists of " + i + " letters.");
            }
            if (counter > 1) {
                System.out.println("There are " + lengthOfWords[i] + " words that consist of " + i + " letters.");
            }
        }
    }
//    public static String sortByFirstLetter(ArrayList<String> words)
}
