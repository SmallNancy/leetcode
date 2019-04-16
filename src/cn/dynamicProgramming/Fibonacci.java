package cn.dynamicProgramming;

/**
 * @Author: Nancy
 * @Date: 2019/4/16 13:18
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(6));

    }
    public static int Fib(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1 || n == 2)
            return 1;
        int a1 = 1;
        int a2 = 1;
        for (int i = 3;i <= n;i++) {
            int temp = a2;
            a2 += a1;
            a1 = temp;
        }
        return a2;
    }
}
