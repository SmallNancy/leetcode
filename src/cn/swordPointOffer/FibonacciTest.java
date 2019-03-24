package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 12:45
 * Fibonacci 数列
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));

    }

    public static int Fibonacci(int n) {
        return 1 << --n;
    }
    public int NumberOf1(int n) {
        int num = 0;
        char arr[] = Integer.toBinaryString(n).toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == '1')
                num += 1;
        }
        return num;
    }
}
