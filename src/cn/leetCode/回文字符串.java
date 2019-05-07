package cn.leetCode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */

public class 回文字符串 {
    public static void main(String[] args) {
//       String s = "A man, a plan, a canal: Panama";
        String s = "s a r";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length();i++) {
            char temp = s.charAt(i);
            if ((temp >= 'a' && temp <= 'z') ||(temp >= 'A' && temp <= 'Z')||(temp >= '0' && temp <= '9')) {
                if (temp >= 'A' && temp <= 'Z') {
                    temp = (char)(temp-'A'+'a');
                }
               sb.append(temp);
            }
        }
//        System.out.println(sb.toString());
        String temp = sb.toString();
//        System.out.println(sb.toString());

        if((sb.reverse().toString()).equals(temp)) {
            return  true;
        }else {
            return false;
        }

    }
}
