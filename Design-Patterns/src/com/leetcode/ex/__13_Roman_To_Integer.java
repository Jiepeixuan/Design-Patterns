package com.leetcode.ex;

public class __13_Roman_To_Integer {

    public String intToRoman(int param) {
        String str = "";
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; param != 0; i++) {
            while (param >= value[i]) {
                param -= value[i];
                str += symbol[i];
            }
        }
        return str;
    }

    public static int romanToInteger(String param) {
        char[] chars = param.toCharArray();
        int ret = tranToInt(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (tranToInt(chars[i - 1]) < tranToInt(chars[i])) {
                ret += tranToInt(chars[i]) - 2 * tranToInt(chars[i - 1]);
            } else {
                ret += tranToInt(chars[i]);
            }
        }
        return ret;
    }

    public static int tranToInt(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("DCXXI"));
    }

}
