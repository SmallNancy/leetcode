package cn.HuaWei;
import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/2 10:56
 */
public class Test03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            int[] temp = new int[1000];
            for (int i = 0; i < num; i++) {
                temp[arr[i]] = 1;
            }
            for (int i = 0; i < 1000; i++) {
                if (temp[i] == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}