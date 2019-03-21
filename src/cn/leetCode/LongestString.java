package cn.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * leetCode 02
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */
public class LongestString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    // TODO 最长不相同子串
    public static int lengthOfLongestSubstring(String s) {
        int i = 0,j = 0,max = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max,set.size()); // 保留最大长度
            }else {
                set.remove(s.charAt(i++));
            }
        }
        //max = set.size();
        return max;
    }
}
