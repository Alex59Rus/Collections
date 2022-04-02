package com.alexey.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueLogic {
    public static ArrayList<Integer> definitionOfUniqueness(List<Integer> valueStore) throws Exception{
        Set<Integer> setUniqueness = new TreeSet<>(valueStore);
        if (valueStore.size() == setUniqueness.size()) {
            System.out.println("Дубликатов нет");
        }else {
            System.out.println("Дубликаты есть");
        }
        return null;
    }
}
