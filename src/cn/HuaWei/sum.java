package cn.HuaWei;

import java.util.Scanner;

/**
 * 两个大整数相加 26进制
 */
public class sum {
    public static void main(String[] args) {
        String num1 = "z";
        String num2 = "bc";

        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int next = 0;
        while(i>=0&&j>=0){
            int temp = num1.charAt(i)+num2.charAt(j)+next;
            int a = 'a';
            if(temp>=2*a+26){
                temp -= a+26;
                next = 1;
            }else{
                temp -= a;
                next = 0;
            }
            sb.append((char)temp);
            i--;
            j--;
        }
        if(i>=0){
            while (i>=0){
                int c = num1.charAt(i)+next;
                if(c>='a'+26){
                    next = 1;
                    sb.append((char)(c-26));
                }else{
                    sb.append((char)c);
                }
                i--;
            }
        }
        if(j>=0){
            while(j>=0){
                int c = num2.charAt(j)+next;
                if(c>='a'+26){
                    next = 1;
                    sb.append((char)(c-26));
                }else{
                    sb.append((char)c);
                }
                j--;
            }
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
