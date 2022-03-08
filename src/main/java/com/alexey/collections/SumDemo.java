package com.alexey.collections;

import java.sql.Array;
import java.util.Arrays;

import static com.alexey.collections.SumLogic.*;


public class SumDemo {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+17;
        }
        System.out.println(Arrays.toString(arr));
        indexReturnByMap(arr,39);
    }
}

