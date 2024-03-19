package org.example;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        int[][] nums = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        Map<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();


        map.computeIfPresent(list, (k, v) -> v + 1);
        int[] nums1 = {2, 4, 6};
        int k = 58;
        String s = "aec*";
        String t = "abcde";

        System.out.println(RemovingStarsFromAString.removeStars(s));
    }


}