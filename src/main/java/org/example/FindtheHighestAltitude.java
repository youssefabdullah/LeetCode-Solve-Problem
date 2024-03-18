package org.example;
//1732. Find the Highest Altitude

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindtheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        List<Integer> list = new ArrayList<>();
        for (int i = -1; i < gain.length; i++) {
            if (i == -1) list.add(0);
            else {
                list.add(gain[i] + list.get(list.size() - 1));
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
