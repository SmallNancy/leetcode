package cn.sort;

/**
 * @Author: Nancy
 * @Date: 2019/3/20 12:48
 * shell sort  :insert sort improved
 */
public class SellSort {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,7,8};
        show(arr);
        shell(arr);
        show(arr);

    }


    public static void shell(int[] arr){
        if(arr == null ||arr.length == 1)
            return;
        for(int gap = arr.length / 2; gap > 0;gap /= 2){
            for(int i = gap; i < arr.length; i += gap){
                int temp = arr[i];
                int j = i - gap;
                while(j >= 0 && arr[j] > temp){
                    arr[j + gap] = arr[j];
                    j -=gap;
                }
                arr[j + gap] = temp;

            }
        }
    }

    public static void show(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
