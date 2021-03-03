package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assign3HashMap {

    public static void main(String[] args) {

        HashMap<String, Double> pricePage = new HashMap<String, Double>();
        pricePage.put("Apples", 0.30);
        pricePage.put("Bananas", 0.40);
        pricePage.put("Pears", 1.20);
        pricePage.put("Oranges", 0.80);
        pricePage.put("Kiwi", 1.10);
        pricePage.put("Mango", 2.10);
        pricePage.put("Pineapple", 1.50);
        pricePage.put("Grapes", 2.50);

        System.out.println("Current price page: ");
        for (Map.Entry products : pricePage.entrySet()) {
            System.out.println(products.getKey() + " " + products.getValue());
        }

        System.out.format("\nThere are %d products under 1 Eur.", underOneEur(pricePage));
        System.out.format("\nThe lowest price is %s Eur.", lowestPrice(pricePage));
        System.out.format("\nThe highest price is %s Eur.", highestPrice(pricePage));

        String minPrice = Collections.min(pricePage.keySet());
        System.out.println("\nLowest product price: " + minPrice + " = " + pricePage.get(minPrice) + " Eur.");

        String maxPrice = Collections.max(pricePage.keySet());
        System.out.println("Highest product price: " + maxPrice + " = " + pricePage.get(maxPrice) + " Eur.");

        HashMap<String, Double> pricePage2 = new HashMap<String, Double>();
        pricePage2.put("Potatoes", 0.35);
        pricePage2.put("Carrots", 0.45);
        pricePage2.put("Onion", 0.70);
        pricePage2.put("Radish", 1.70);
        pricePage2.put("Lettuce", 2.10);
        pricePage2.put("Beets", 1.45);
        pricePage2.put("Garlic", 4.50);
        pricePage2.put("Dill", 5.00);

        System.out.println("\nMerged price page: ");
        // https://stackoverflow.com/questions/55960288/how-do-i-merge-2-hashmaps-together
        pricePage.forEach((key, value) -> pricePage2.merge(key, value, Double::sum));
        pricePage2.forEach((String, Double) -> System.out.println(String + " " + Double));

        System.out.println("There are " + pricePage2.size() + " products in the merged price page.");

        System.out.println("\nSorted price page in ascending order: ");
        TreeMap<String, Double> sortedPricePage = new TreeMap<>(pricePage2);
        for (Map.Entry sort : sortedPricePage.entrySet()){
            System.out.println(sort.getKey() + " " + sort.getValue());
        }
    }

    public static int underOneEur(Map<String, Double> map) {
        int counter = 0;
        for(double price : map.values()) {
            if (price < 1) {
                counter++;
            }
        }
        return counter;
    }

    public static double lowestPrice(Map<String, Double> map) {
        return Collections.min(map.values());
        // https://stackoverflow.com/questions/2776176/get-minvalue-of-a-mapkey-double
    }

    public static double highestPrice(Map<String, Double> map) {
        return Collections.max(map.values());
    }


    public static void print(Map<String, Double> pricePage2) {
        Set set = pricePage2.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry products = (Map.Entry)i.next();
            System.out.print(products.getKey() + ": ");
            System.out.println(products.getValue());
        }
    }
}
