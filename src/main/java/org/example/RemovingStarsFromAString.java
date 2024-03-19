package org.example;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') stack.pop();
            else stack.add(s.charAt(i) + "");
        }

        while (stack.size() != 0)
            st = stack.pop()+st;

        return st;
    }
}
