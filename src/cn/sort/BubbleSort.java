package cn.sort;

/**
 *  八大排序之：冒泡排序以及优化处理
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,9,3};
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        bubble(arr);
        for(int i : arr){
            System.out.print(i +" ");
        }

    }

    public static void bubble(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }

    }
}
