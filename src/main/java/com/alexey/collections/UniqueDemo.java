package com.alexey.collections;

import com.sun.source.tree.Tree;

import java.util.*;

import static java.util.List.of;

public class UniqueDemo {
    public static void main(String[] args) {
        List<Integer> input = definitionUniq(List.of(1,2,3,4,5,6,5));
    }
    private static ArrayList<Integer> definitionUniq(List<Integer> valueStore) {
        Set<Integer> setUniq = new TreeSet<>(valueStore);
        if (valueStore.size() == setUniq.size()) {
            System.out.println("Дубликатов нет");
        }else {
            System.out.println("Дубликаты есть");
        }
        return null;
    }
}
