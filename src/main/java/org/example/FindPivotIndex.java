package org.example;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == l) return i;
            l += nums[i];
        }
        return -1;
    }
}
