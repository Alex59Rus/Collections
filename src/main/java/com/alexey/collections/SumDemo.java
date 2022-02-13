package com.alexey.collections;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;


public class SumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int desired = scanner.nextInt();

        Map<Integer, Integer> numbers = new HashMap<>();
        Map<Integer,Integer> mapa = Map.of(0,3,1,8,2,15,3,17);

        System.out.println("result: " + mapa);
    }

    private static HashMap<Integer, Integer> findSum(HashMap<Integer,Integer> input, Integer desired) {
        return null;
    }
}
