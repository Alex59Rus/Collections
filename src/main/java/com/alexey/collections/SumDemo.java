package com.alexey.collections;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;


public class SumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intUser = scanner.nextInt();
        Map<Integer, Integer> numbers = new HashMap<>();
        ArrayList<Integer> valueStore = new ArrayList<>();
        int input = 23;
        numbers.put(0, 3);
        numbers.put(1, 8);
        numbers.put(2, 15);
        numbers.put(3, 17);
        for (int i = 0; i < numbers.size() - 1; i++) {
            int x = input - numbers.get(i);
            if (numbers.containsValue(x)) {
                valueStore.add(i);
            }
        }
        System.out.println("result: " + valueStore);
    }
}
