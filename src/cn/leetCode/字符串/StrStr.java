package cn.leetCode.字符串;

import java.util.Scanner;

public class StrStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println( newStr(haystack,needle));

    }

    public static int newStr(String haystack, String needle) {
        if (haystack.equals("") && needle.equals(""))
            return 0;
        if (haystack.equals("") && !needle.equals(""))
            return -1;
        if (needle.equals(""))
            return 0;
        for (int i = 0; i < haystack.length(); i++) {
            //System.out.println(haystack.substring(i,needle.length()+1));
            if ((i+needle.length()) - 1 < haystack.length()) {
                if (haystack.substring(i,i+needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;

    }
}
