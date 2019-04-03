package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/2 14:59
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.next();
            int sum = 0;  // 十进制数
            int count = 1; //累乘的控制变量
            int temp = str.length() - 1;

            while('x' != str.charAt(temp)) {
                char c = str.charAt(temp);
                if(c >= '0' && c <= '9') {
                    sum += (c - '0') * count;
                }else if(c >= 'A' && c <= 'F') {
                    sum += (c - 'A' + 10) * count;
                }
                count *= 16;
                temp--;
            }
            System.out.println(sum);
        }
    }
}
