package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 15:38
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 */
public class Test06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long value = sc.nextLong();
            System.out.println(getResult(value));
        }
    }
    public static String getResult(long ulDataInput) {
        //long temp = ulDataInput;
        String str = "";
        for(int i = 2;i <= ulDataInput;i++) {
            if(ulDataInput % i == 0) {
                if(isPrime(i)) {
                    str += i + " ";
                    ulDataInput /= i;
                    i--;
                }
            }
        }
        return str;
    }

    /**
     * 判断是否为质数
     * @param num
     * @return  true 质数 ，false 不是质数
     */
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i <= Math.sqrt(num);i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
