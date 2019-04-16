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
        int[] F = new int [n+1];
        if (n < 1) {
            return -1;
        }
        if (n == 1 || n == 2)
            return 1;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3;i <= n;i++) {
            F[i] = F[i-1] +F[ i-2];
        }
        return F[n];
    }
}
