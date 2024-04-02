package org.example;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {

        Stack<String> string = new Stack<>();
        Stack<Integer> num = new Stack<>();
        String temp = "", number = "";
        boolean b = false, isNumber = false;
        for (int i = 0; i < s.length(); i++) {
            if (isInteger(s.charAt(i) + "")) {
                number += s.charAt(i);
                isNumber = true;
            } else {
                if (isNumber) {
                    num.add(Integer.parseInt(number));
                    isNumber = false;
                    number = "";
                }

                if (s.charAt(i) == ']') {
                    b = true;
                    while (b) {
                        String ch = string.pop();
                        if (!ch.equals("["))
                            temp = ch + temp;
                        else
                            b = false;
                    }
                    string.add(calculateString(num.pop(), temp));
                    temp = "";
                } else
                    string.add(s.charAt(i) + "");
            }
        }
        int size = string.size();
        String res = "";
        for (int i = 0; i < size; i++) {
            res = string.pop() + res;
        }
        return res;

    }

    public static boolean isInteger(String s) {
        try {
            int x = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String calculateString(int x, String s) {
        String s1 = "";
        for (int i = 0; i < x; i++) {
            s1 += s;
        }
        return s1;
    }
    //best preformnce
    public String decodeString1(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        int num = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            else if(c == '['){
                numStack.push(num);
                strStack.push(res);
                num = 0;
                res = new StringBuilder();
            }
            else if(c == ']'){
                int repeatTimes = numStack.pop();
                StringBuilder str = new StringBuilder();
                for(int i = 0; i < repeatTimes; i++){
                    str.append(res);
                }
                res = strStack.pop().append(str);
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
