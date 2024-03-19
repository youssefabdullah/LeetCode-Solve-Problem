package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            list.add(Arrays.stream(grid[i]).boxed().collect(Collectors.toList()));
        }
        for (int i = 0; i < grid.length; i++) {
            int finalI = i;
            list.add(Arrays.stream(grid).map(ints -> ints[finalI]).collect(Collectors.toList()));
        }
        int sum=0;
        for (int i = 0; i < list.size() / 2; i++) {
            for (int j = list.size() / 2; j < list.size() ; j++) {
                if(list.get(i).equals(list.get(j)))sum++;
            }
        }
        return sum;
    }
    public int equalPairsBest(int[][] grid) {
        Map<String, Integer> cnt = new HashMap<>();
        for (int[] row : grid) {
            cnt.merge(Arrays.toString(row), 1, Integer::sum);
        }
        int pairs = 0;
        for (int c = 0, n = grid.length; c < n; ++c) {
            int[] col = new int[n];
            for (int r = 0; r < n; ++r) {
                col[r] = grid[r][c];
            }
            pairs += cnt.getOrDefault(Arrays.toString(col), 0);
        }
        return pairs;
    }
}
