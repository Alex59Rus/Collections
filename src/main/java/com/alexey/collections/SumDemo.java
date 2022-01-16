package com.alexey.collections;

import java.util.*;


public class SumDemo {
    public static void main(String[] args) {
        SumTask logic = new SumTask();
        List<Integer> result = SumTask.checkSum(List.of(3,8,15,17), 32);
    }
}
