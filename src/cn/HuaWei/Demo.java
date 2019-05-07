package cn.HuaWei;

public class Demo {
     static  int len = 0;;
    public static void main(String[] args) {
        String str = "12345qw1234567sdere12378986767565";
        System.out.println(longestStr(str) + " " + len);
    }

    //TODO:返回最长数字串 字符串长度
    public static String longestStr(String str) {
        String temp = "";
        String s = "";
        for (int i = 0;i < str.length();i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                s += str.charAt(i);
            }else {
                if (s.length() > temp.length()) {
                    temp = s;
                    len = s.length();
                    s = "";
                }
            }
        }
        if (s.length() > temp.length()) {
            temp = s;
            len = s.length();
        }
        return temp;
    }

}
