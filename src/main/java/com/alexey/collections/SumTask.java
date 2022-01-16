package com.alexey.collections;

import java.sql.SQLOutput;
import java.util.*;

public class SumTask {
    public static List<Integer> checkSum(List<Integer> numbers, Integer sum) {
        List<Integer> indexStore = new ArrayList(); //складываем в эту коллекцию индексы у искомых чисел
        for (int i = 0; i <= numbers.size() -1 ; i++) {
            int desiredNumber = sum - numbers.get(i); //Переменная отвечает за второе искомое число (10-7=3 ищем число 3)
            if (numbers.contains(desiredNumber)) { //если в коллекции найдено искомое число(а)
                indexStore.add(numbers.indexOf(desiredNumber)); //добавляем в наше хранилище индексов, индексы найденных значений
                Collections.reverse(indexStore);
            }
        }
        System.out.println("result = " + indexStore);
            return null;
    }
}
