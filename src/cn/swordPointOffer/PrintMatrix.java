package cn.swordPointOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 12:20
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 */
public class PrintMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(printMatrix(matrix));

    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;         // 行数
        int columns = matrix[0].length;  // 列数
        if (row == 0 || columns == 0){
            return null;
        }
        int left = 0,top = 0;
        int right = columns - 1;
        int bottom = row - 1;
        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++){            // 从左到右
               list.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {       // 从上到下
                list.add(matrix[i][right]);
            }
            if (top != bottom) {
                for (int i = right - 1;i >= left; i--) {    // 从右到左
                    list.add(matrix[bottom][i]);
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {    //从下到上
                    list.add(matrix[i][left]);
                }
            }
            left++;right--;top++;bottom--;
        }
        return list;

    }
}

