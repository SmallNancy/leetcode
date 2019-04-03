package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/2 11:24
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next().trim();
            String str2 = sc.next().trim();
            Split(str1);
            Split(str2);
        }
    }

    public static void Split(String str) {
        while(str.length() >= 8) {
            System.out.println(str.substring(0, 8));
            str = str.substring(8);
        }
        if(str.length() > 0 && str.length() < 8) {
            str = str +"0000000";
            System.out.println(str.substring(0, 8));
        }
    }
}
