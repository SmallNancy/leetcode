package cn.leetCode.数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Nancy
 * @Date: 2019/4/11 10:04
 */
public class 存在重复 {
    private Set<Integer> set = new HashSet<>();

    /**
     * 依据set的特性，插入重复元素直接返回false
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        for (int i : nums){
            if (!set.add(i)){
                return true;
            }
        }
        return false;
//        Arrays.sort(nums);
//        for (int i = 0; i< nums.length;i++) {
//            if (nums[i]  == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
    }
}
