package com.alexey.collections;

import java.util.List;

public class UniqueDemo {
    public static void main(String[] args) {
        UniqueTask task = new UniqueTask();
        //List<Integer> result = UniqueTask.containsDuplicate(List.of(3,66,33,12,15,21,1,100,12));
        List<Integer> result = UniqueTask.containsDuplicate(List.of(2,3,4,5,5,6,7,8));

    }
}
