package org.example;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        int[] nums = {1,2,-5};
        Map<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();


        map.computeIfPresent(list, (k, v) -> v + 1);
        int[] nums1 = {2, 4, 6};
        int k = 58;
        String s = "aec*";
        String t = "abcde";

//        for (int x:
//             AsteroidCollision.asteroidCollision(nums)) {
//            System.out.println(x);
//        }
        System.out.println(DecodeString.decodeString("100[leetcode]"));
    }


}