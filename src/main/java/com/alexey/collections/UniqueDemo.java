package com.alexey.collections;

import java.util.*;

import static com.alexey.collections.UniqueLogic.definitionOfUniqueness;
import static java.util.List.of;

public class UniqueDemo {
    public static void main(String[] args) throws Exception {
        List<Integer> input = definitionOfUniqueness(List.of(1,2,3,4,5,6));
        definitionOfUniqueness(input);
    }


}
