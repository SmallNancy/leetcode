package cn.dynamicProgramming;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/16 15:08
 */
public class 背包 {
    public static void main(String[] args) {
        int[] itmes = {0,2,3,4,1,5};
        int[] values = {0,3,2,4,2,8};
        int maxWeight = 10;
        int[][]  arr = new int[itmes.length][maxWeight+1];
        for (int i = 0;i < maxWeight;i++) {
            arr[0][i] = 0;
        }
        for (int i = 0;i < itmes.length;i++) {
            arr[i][0] = 0;
        }

        for (int i = 1;i < itmes.length; i++) {
            for (int j = 1;j <= maxWeight; j++) {
                if (itmes[i] > j) {
                    arr[i][j] = arr[i -1][j];
                }else {
                    arr[i][j] = Math.max(arr[i -1][j],arr[i -1][j - itmes[i]] + values[i]);
                }
            }
        }

        System.out.println(arr[itmes.length - 1][maxWeight]);
    }
}
