package cn.test;

import java.util.Scanner;

public class 回文子串 {
    // 最长回文子序列
    static int maxLen=0,start=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine().trim();
            System.out.println(longestPalindrome(s).toString());
            System.out.println(maxLen);
        }
    }
    public static String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        for (int i = 0; i < s.length() - 1 ;i++) {
            Palindrome(s,i,i);
            Palindrome(s,i,i+1);
        }
        return s.substring(start,start+maxLen);
    }
    public static void Palindrome(String s,int i,int j) {
        while (i >= 0 && j <s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (j - i - 1 > maxLen) {
            start = i+1; // 回文串开始位置
            maxLen = j - i - 1;
        }
    }
}
