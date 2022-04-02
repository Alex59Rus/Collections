package com.alexey.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumLogic {
    public static int[] indexReturnByMap(int[] inputArray, int reqAm) throws Exception {
        // O(1)
        Map<Integer, Integer> newMap = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            newMap.put(inputArray[i], i);
        }
        for (int i = 0; i < inputArray.length; i++) {
            int newNumber = reqAm - inputArray[i];

            if (newMap.containsKey(newNumber) && newMap.get(newNumber) != i) {
                return new int[]{i, newMap.get(newNumber)};
            }
        }
        throw new Exception("Can't find this number");
        }
    }




