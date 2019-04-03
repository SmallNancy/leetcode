package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/1 20:57
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNextLine()){
            str = sc.nextLine();
            String temp = str.trim();
            int index = 0;
            for (int i = 0;i < temp.length();i++){
                if (str.charAt(i) == ' '){
                    index = i+1;
                }
            }
            int len = temp.length() - index;
            System.out.println(len);
        }
    }
}
