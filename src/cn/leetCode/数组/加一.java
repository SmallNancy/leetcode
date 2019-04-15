package cn.leetCode.数组;

/**
 * @Author: Nancy
 * @Date: 2019/4/12 12:39
 */
public class 加一 {
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        int[] temp = plusOne(arr);
        for (int i : temp) {
            System.out.print(i + " ");
        }

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1;i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;

    }
}
