package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(Integer.valueOf(arr[i])) == null) map.put(Integer.valueOf(arr[i]), 1);
            else {
                map.put(Integer.valueOf(arr[i]), map.get(Integer.valueOf(arr[i])) + 1);
            }
        }
        List<Integer> list = map.values().stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) return false;
        }
        return true;
    }
}
