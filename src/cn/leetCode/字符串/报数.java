package cn.leetCode.字符串;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class 报数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long start = System.currentTimeMillis();
            System.out.println(countAndSay(n));
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        }
    }
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1;i < n; i++) {
            int count = 0;
            char c = s.charAt(0);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length();j++) {
                if (s.charAt(j) == c) {
                    count++;
                }else {
                    sb.append(count).append(c);
                    c = s.charAt(j);
                    count = 1;

                }
                if (j == s.length() - 1) {
                    sb.append(count).append(c);
                }
            }
            s = sb.toString();
        }
        return s;

    }
}
