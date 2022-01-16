package com.alexey.collections;

import java.util.*;

public class UniqueTask {
    public List<Integer> containsDuplicate(List<Integer> input) {
        List<Integer> valueStore = new ArrayList(); //Хранилище найденных дубликатов
        Collections.sort(input); //Сортируем полученную коллекцию по возрастсанию
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i) == input.get(i+1)){
                valueStore.add(i); //если найдено совпадение добавляем его в наше хранилище
                System.out.println("Result: " + true);
                System.out.println("Число " + input.get(i) + " Повторяется 2 раза");
            }
        }
        if (valueStore.isEmpty()) { //если никаких совпадений не найдено и коллекция пуста
            System.out.println("Result: " + false);
            System.out.println("Дубликатов нет");
        }
        return null;
    }
}
