package cn.leetCode;

/**
 * @Author: Nancy
 * @Date: 2019/4/4 10:00
 * 最长的回文子串
 */
public class LongestPalindromic {
     private int start, len;
     String temp = "";
    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
       // String s = "argersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethu";
       // System.out.println(s.substring(2,4));
        String ss = "babad";
        LongestPalindromic l = new LongestPalindromic();
        System.out.println( l.longestPalindrome(s));
        //System.out.println(longestPalindrome(ss));;

    }

    public  String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        for (int i = 0;i < s.length() - 1;i++) {
            Palindrome(s,i,i);
            Palindrome(s,i,i+1);

        }
        return s.substring(start,start+len);
    }
    public  void Palindrome(String s,int j,int k) {
        while (j >= 0 && k < s.length() && s.charAt(k) == s.charAt(j)) {
            j--;
            k++;
        }
        if (k - j - 1 > len) {
           start = j + 1;
           len = k - j -1;
        }
    }


}
