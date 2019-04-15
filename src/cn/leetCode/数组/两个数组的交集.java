package cn.leetCode.数组;

import java.util.Arrays;

/**
 * @Author: Nancy
 * @Date: 2019/4/12 14:00
 */
public class 两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] temp = intersect(nums1,nums2);
        for (int i:temp){
            System.out.println(i + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] num = nums2;
        int count = 0;
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (nums1[i] == num[j]) {
                    arr[count++] = nums1[i];
                    num[j] = num.hashCode();
                    break;
                }
            }
        }
        int[] t = new int[count];
        for (int i = 0; i< count;i++) {
            t[i] = arr[i];
        }
        return t;

    }
}
