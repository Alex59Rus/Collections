package com.alexey.collections;

import com.sun.source.tree.Tree;

import java.util.*;

import static java.util.List.of;

public class UniqueDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = definition(List.of(1,2,3,4,5,6));
    }
    private static ArrayList<Integer> definition(List<Integer> arrayList) {
        Set<Integer> listUn = new TreeSet<>(arrayList);
        if (arrayList.size() == listUn.size()) {
            System.out.println("Дубликатов нет " + false);
        }else {
            System.out.println("Дубликаты есть " + true);
        }
        return null;
    }
}
