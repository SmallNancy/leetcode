package cn.leetCode.数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Nancy
 * @Date: 2019/4/11 10:26
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class 只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber1(nums));
    }

    /**
     * 异或解决 2^2=0  2^2^3=3 3^2^2=3
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        int temp = 0;
        for (int i = 0; i< nums.length; i++) {
            temp = temp^nums[i];
        }
        return temp;
    }

    /**
     * HashSet解决重复问题
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();

    }
    public static int singleNumber3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i+=2) {
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length - 1];
    }
}
