package cn.test;

import java.util.Scanner;

/**
 * 跳跃比赛
 */
public class 贪心 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int k=0;k<n;k++)
            {
                nums[k] = sc.nextInt();
            }

            int i = 0;
            int next = 0; // 记录下一跳
            int max = 0;
            int count = 0;

           while(i+nums[i] < nums.length) {
               if (nums[i] == 0){
                   System.out.println("不可达");
                   return;
               }
               for (int k = i;k <= i + nums[i];k++) {
                   if (k+nums[k] >= max) {
                       max = k + nums[k];
                       next = k;
                   }
               }
               if (max == 0) {
                   break;
               }
               count++;
               i = next;
               max = 0;
           }
            System.out.println(count);
        }

}
