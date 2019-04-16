package cn.leetCode.数组;

/**
 * @Author: Nancy
 * @Date: 2019/4/16 10:11
 */
public class 旋转图像 {
    public static void main(String[] args) {
        旋转图像 p = new 旋转图像();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        p.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        int k = matrix.length - 1;
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0;j < matrix.length; j++) {
                temp[j][k] = matrix[i][j];
            }
            k--;
        }
        for (int i = 0;i < matrix.length;i++) {
            for (int j = 0; j < matrix.length;j++) {
                matrix[i][j]= temp[i][j];
                //System.out.print(temp[i][j] + " ");
            }
        }

    }
}
