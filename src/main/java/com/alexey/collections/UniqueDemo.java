package com.alexey.collections;

import java.util.List;

public class UniqueDemo {
    public static void main(String[] args) {
        UniqueTask task = new UniqueTask();
        List<Integer> result = task.containsDuplicate(List.of(2,3,4,5,6,6,7,8));
    }
}
