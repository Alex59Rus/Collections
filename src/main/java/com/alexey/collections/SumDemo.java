package com.alexey.collections;

import java.util.*;


public class SumDemo {
    public static void main(String[] args) {
        SumTask logic = new SumTask();
        List<Integer> result = logic.checkSum(List.of(2,3,4,5,6), 8);
    }
}
