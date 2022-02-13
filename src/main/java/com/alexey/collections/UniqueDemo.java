package com.alexey.collections;

import com.sun.source.tree.Tree;

import java.util.*;

import static java.util.List.of;

public class UniqueDemo {
    public static void main(String[] args) {
        List<Integer> input = definitionOfUniqueness(List.of(1,2,3,4,5,6,5));
    }
    private static ArrayList<Integer> definitionOfUniqueness(List<Integer> valueStore) {
        Set<Integer> setUniqueness = new TreeSet<>(valueStore);
        if (valueStore.size() == setUniqueness.size()) {
            System.out.println("Дубликатов нет");
        }else {
            System.out.println("Дубликаты есть");
        }
        return null;
    }
}
