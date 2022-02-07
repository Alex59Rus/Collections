package com.alexey.collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class UniqueDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> store = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(19);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);
        Collections.sort(arrayList);
        Set<Integer> TreeSet = new TreeSet<>(arrayList);
/*        if (arrayList.size() == TreeSet.size()) {
            System.out.println("Дубликатов нет " + false);
        }else {
            System.out.println("Дубликаты есть " + true);
        };*/
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) == arrayList.get(i + 1)) {
                store.add(arrayList.get(i));
            }
        }
        System.out.println("Дубликаты " + store);
    }
}
