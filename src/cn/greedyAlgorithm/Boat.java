package cn.greedyAlgorithm;

import java.util.Arrays;

/**
 * @Author: Nancy
 * @Date: 2019/4/12 17:05
 * 海盗船重量不能超过30
 */
public class Boat {
    public static void main(String[] args) {
        double w[] = {4,10,7,11,3,5,14,2};
        double temp = 0;  //装入重量
        int num = 0; // 古董装入个数
        for (int i = 0; i < w.length - 1;i++) {
            for (int j = 0;j < w.length - i - 1;j++) {
                if (w[j] > w[j+1]) {
                    double t = w[j];
                    w[j] = w[j + 1];
                    w[j+1] = t;
                }
            }
        }
        for (int i = 0; i < w.length;i++) {
            if ((temp += w[i])<=30) {
                num += 1;
            }else {
                break;
            }
        }
        System.out.println(num);


    }
}
