package cn.test;


public class Bag {
    static int num2 = Integer.MAX_VALUE;
    public static void main(String[] args) {
//        int[] val = {6,3,5,4,6};
//        int[] w = {2,2,6,5,4};
//        int max = 10;
//        System.out.println(maxVal(val, w, max));

        int[][] arr = {
                {0,5,2,6,8},
                {6,7,3,5,2},
                {2,5,7,1,2},
                {6,2,7,3,8}

        };
        //System.out.println(result(arr.length - 1,arr[0].length - 1,arr));
//        System.out.println(result2(arr));
        result3(0,0,arr,0);
        System.out.println(num2);


    }

    //回溯法
    public static void result3(int i, int j, int[][] arr, int sum) {
        if (i == arr.length -1 && j == arr[0].length - 1) {
            if(sum+arr[i][j]<num2){
                num2 = sum+arr[i][j];
            }

        }
        if (i < arr.length - 1) {
//            int temp = sum;
//            sum += arr[i][j];
            result3(i+1,j,arr,sum+arr[i][j]);
//            sum = temp;
        }
        if (j < arr[0].length - 1) {
            result3(i,j+1,arr,sum+arr[i][j]);
        }
    }


    //动态规划
    public static int result2(int[][] arr) {
        int[][] t = new int[arr.length+1][arr[0].length+1];
        for (int i = 1; i < t.length;i++) {
            for (int j = 1; j < t[i].length;j++) {
                if (t[i-1][j] > t[i][j-1]) {
                    t[i][j] = t[i-1][j] +arr[i - 1][j -1];
                }else {
                    t[i][j] = t[i][j-1] +arr[i -1][j - 1];
                }
            }
        }
        return t[arr.length][arr[0].length];

    }


    //递归
    public static int result(int i,int j,int[][] arr) {
        int top = 0;
        int left = 0;
        if(i>=1){
            top = result(i-1,j,arr);
        }
        if(j>=1){
            left = result(i,j-1,arr);
        }
        return maxVal(top,left)+arr[i][j];
    }

    public static int maxVal(int[] val,int[] w,int max) {
        int[][] res = new int[val.length+1][max+1];
        for (int i = 1; i < res.length;i++) {
            for (int j = 1; j < res[i].length;j++) {
                if (w[i-1] <= j) {
                    res[i][j] = maxVal(res[i-1][j],res[i-1][j-w[i-1]]+val[i-1]);
                }else {
                    res[i][j] = res[i - 1][j];
                }
            }
        }
        return res[val.length][max];
    }

    public static int maxVal(int a,int b) {
        return a > b ? a : b;
    }

}
