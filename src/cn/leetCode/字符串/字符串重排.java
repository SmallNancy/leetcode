package cn.leetCode.字符串;

import java.util.*;

/**
 * 给你一个原始字符串，根据该字符串内每个字符出现的次数，
 * 按照ASCII码递增顺序重新调整输出。
 */

public class 字符串重排 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length();i++) {
            char temp = str.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp,map.get(temp)+1);
            }else {
                map.put(temp,1);
            }
        }
        int max = 0;
        for (char c:map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max;i++) {
            for (char c:map.keySet()) {
                if (map.get(c) >0) {
                    map.put(c,map.get(c) - 1);
                    sb.append(c);
                }
            }

        }
        System.out.println(sb.toString());
    }
}
