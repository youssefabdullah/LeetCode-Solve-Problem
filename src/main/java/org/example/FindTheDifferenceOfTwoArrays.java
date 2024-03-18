package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> num1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> num2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        int p1 = 0, c = 0;
        while (p1 < nums1.length && num2.size() != 0) {
            if (num2.contains(nums1[p1])) {
                num2.remove(Integer.valueOf(nums1[p1]));
            } else {
                p1++;
            }
        }
        p1 = 0;
        while (p1 < nums2.length && num1.size() != 0) {
            if (num1.contains(nums2[p1])) {
                num1.remove(Integer.valueOf(nums2[p1]));
            } else {
                p1++;
            }
        }
        p1 = 0;

        num1 = num1.stream().distinct().collect(Collectors.toList());
        num2 = num2.stream().distinct().collect(Collectors.toList());

        list.add(num1);
        list.add(num2);
        return list;
    }
}
