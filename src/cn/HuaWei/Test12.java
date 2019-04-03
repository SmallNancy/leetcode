package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 13:55
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            String s = "";
            for(int i = str.length() - 1;i >= 0; i--) {
                s += str.charAt(i) + "";
            }
            System.out.println(s);
        }
    }

}
