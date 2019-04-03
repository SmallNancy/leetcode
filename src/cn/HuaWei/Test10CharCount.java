package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 13:45
 */
public class Test10CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int count = 0;
            int[] arr = new int[128];
            for(int i = 0;i < str.length(); i++) {
                arr[str.charAt(i)] = 1;
            }
            for(int i = 0;i < arr.length; i++) {
                if(arr[i] == 1)
                    count++;
            }
            System.out.println(count);
        }
    }
}
