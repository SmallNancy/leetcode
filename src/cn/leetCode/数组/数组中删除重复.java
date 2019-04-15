package cn.leetCode.数组;

import java.util.Arrays;

/**
 * @Author: Nancy
 * @Date: 2019/4/10 9:43
 */
public class 数组中删除重复 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int count = 0; //记录不相同数组的个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
}

}
