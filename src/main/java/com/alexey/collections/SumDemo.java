package com.alexey.collections;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;


public class SumDemo {

    public static void main(String[] args) {

        List<Integer> newList = findSum(List.of(3,8,15,17),32);
    }


    private static List<Integer> findSum(List<Integer> list, Integer target) {
        Map<Integer,Integer> check = new HashMap<>();
        Map<Integer,Integer> check1 = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            check.put(target - list.get(i), list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            check1.put(i, list.get(i));
        }
        for (int i = 0; i < check.size(); i++) {
            if (check.containsKey(check1.containsValue(i)));
            check1.put(i,check.get(i));

        }return null;
    }
}
