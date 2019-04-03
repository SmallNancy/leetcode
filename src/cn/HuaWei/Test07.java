package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 15:39
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 输入  5.5
 * 输出   6
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            float value = sc.nextFloat();
            if(value * 10 % 10 >= 5) {
                System.out.println((int)value + 1);
            }else {
                System.out.println((int)value);
            }

        }
    }
}
