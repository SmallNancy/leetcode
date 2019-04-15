package cn.leetCode.数组;

/**
 * @Author: Nancy
 * @Date: 2019/4/15 9:22
 */
public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i =0;i < nums.length - 1; i++) {
            for (int j = i + 1;j < nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return null;

    }
}
