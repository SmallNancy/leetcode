package cn.leetCode.数组;

/**
 * @Author: Nancy
 * @Date: 2019/4/10 10:28
 */
public class 旋转数组 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 4;
        long startTime = System.currentTimeMillis();
        rotate(nums,k);
        long endTime = System.currentTimeMillis();
//      System.out.println(endTime-startTime);
        String str = "1234567";
        System.out.println(retateString(str,2));
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0)
            return;
        if (k >= nums.length) {
            k = k%nums.length;
        }
        int len = nums.length;
        int t = 0;
        for (int i = len - k ; i < len; i++) {
            int temp = nums[i];
            for (int j = i;j > t; j--) {
                nums[j] = nums[j - 1];
            }
            nums[t++] = temp;

        }


    }
    public static String retateString(String str,int k){
        return str.substring(str.length() - k%str.length(),str.length()) + str.substring(0,str.length()-k%str.length());
    }
}
