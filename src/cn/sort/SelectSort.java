package cn.sort;

/**
 * @Author: Nancy
 * @Date: 2019/3/20 13:28
 *
 * Select Sort :  Time Complexity:O(n^2)
 *                Space Complexity:O(1)
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,7,8};
        SellSort.show(arr);
        select2(arr);
        SellSort.show(arr);

    }

    public static void select2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j: minIndex;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

    public static void select(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int temp = i;

            for( int j = i+1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    temp = j;
                }
            }
            arr[temp] = arr[i];
            arr[i] = min;
        }
    }
}
