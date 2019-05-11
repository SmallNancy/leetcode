package cn.sort;

/**
 * 八大排序之：冒泡排序以及优化处理
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,9,3};
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        //bubble(arr);
        test(arr);
        for(int i : arr){
            System.out.print(i +" ");
        }

    }

    public static void test(int[] arr) {
        if (arr == null ||arr.length <2) {
            return;
        }
        for (int end = arr.length - 1;end > 0; end--) {
            for (int i = 0;i < end;i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
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
