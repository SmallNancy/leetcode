package cn.test;

import java.util.Scanner;

public class SplitWord {

    /**
     * GBK编码  数字截取
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(Exit(s1,s2));


    }
    public static boolean Exit(String s1,String s2) {
        boolean flag;
        for (int i = 0; i < s2.length();i++) {
            flag = false;
            for (int j = 0; j < s1.length();j++) {
                if (s2.charAt(i) == s1.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }


}
