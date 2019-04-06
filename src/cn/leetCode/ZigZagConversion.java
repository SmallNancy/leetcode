package cn.leetCode;

/**
 * @Author: Nancy
 * @Date: 2019/4/4 16:20
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 */
public class ZigZagConversion {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1;i++) {
            for (int j = i + 1; j < height.length; j++) {
                int s = (j - i) * Math.min(height[j],height[i]);
                if (s > max) {
                    max = s;
                }

            }
        }
        return max;

    }
}
