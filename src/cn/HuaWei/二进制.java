package cn.HuaWei;

import java.util.Scanner;

/**
 * 输入 3 
 * 0x62 0x80 0x00 
 * 2  4  5 
 * 输出  6  5
 */
public class 二进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字节数组长度：");
        int num = sc.nextInt();
        System.out.println("输入数组：");
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        System.out.println("输入需要显示的个数");
        int needNum = sc.nextInt();
        System.out.println("字节数：");
        int[] byteNum = new int[needNum];
        for (int i = 0;i < needNum;i++) {
            byteNum[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length;i++) {
            String temp = arr[i].substring(2);

        }

    }
}
