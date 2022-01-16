package com.alexey.collections;

import java.util.*;

public class SumTask {
    public static List<Integer> checkSum(List<Integer> numbers, Integer sum) {
        List<Integer> colIndex = new ArrayList(); //складываем в эту коллекцию индексы у искомых чисел
        for (int i = 0; i <= numbers.size() -1 ; i++) {
            int desiredNumber = sum - numbers.get(i);
            if (numbers.contains(desiredNumber)) {
                colIndex.add(numbers.indexOf(desiredNumber));
            }
        }
            return null;
    }
}
