package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 13:50
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 100 --> 001
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String str = "";
            while(num != 0) {
                str += num % 10;
                num /= 10;
            }
            System.out.println(str);
        }
    }

}
