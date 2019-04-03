package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/1 21:15
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String s = sc.next();
            int count = 0;

            char c = s.charAt(0);
            if(c >= 'A' && c <= 'Z') {
                c += 32;
            }
            for (int i = 0; i < str.length();i++){
                char temp = str.charAt(i);
                if(temp >= 'A' && temp <= 'Z') {
                    temp += 32;
                }
                if (temp == c){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
