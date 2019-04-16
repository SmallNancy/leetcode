package cn.leetCode.数组;

import java.util.Arrays;

/**
 * @Author: Nancy
 * @Date: 2019/4/15 9:49
 */
public class 有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[9];

        for (int i = 0; i< 9;i++) {
            for (int j = 0; j< 9;j++) {
                if (board[i][j] != '.') {
                    for (int k = j + 1; k < 9; k++) {
                        if (board[i][j] == board[i][k])
                            return false;
                    }
                }
                if (board[j][i] != '.'){
                    for (int k = j + 1; k < 9; k++) {
                        if (board[j][i] == board[k][i])
                            return false;
                    }
                }

            }
        }
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Arrays.fill(visited,false);
                for(int k=0; k<9; k++){
                    if(!isValid(visited, board[i+k/3][j+k%3]))
                        return false;
                }
            }
        }

                return true;

    }


    public boolean isValid(boolean[] visited, char ch){   //判断当前位置是否为'.'，或是否被访问过
        if(ch == '.')                                     //如果当前位置为'.'则返回true
            return true;

        int num = ch - '0';
        if(num < 1 || num > 9 || visited[num-1])//如果当前位置访问过则返回false
            return false;

        visited[num-1] = true;//将标记数字标记为true,表示该数字已访问过
        return true;

    }
}
