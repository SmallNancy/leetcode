package cn.leetCode.字符串;

public class LongestPre {
    public static void main(String[] args) {
        String[] strs = {"ca","cc"};
        System.out.println( longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(""))
                return "";
        }
        if (strs.length == 1)
            return strs[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        int count = 0;
        boolean flag = true;
        String s = "";
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                s += strs[0].charAt(i);
            }
        }
        return s;
    }
}
