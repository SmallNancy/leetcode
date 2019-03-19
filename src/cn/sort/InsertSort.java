package cn.sort;

/**
 * @Author: Nancy
 * @Date: 2019/3/19 20:55
 *
 * 直接选择排序  需要一个指针，指向已经排好序的数组
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,7,8};
        show(arr);
        insert(arr);
        show(arr);

    }

    public static void insert(int[] arr){
        if(arr == null && arr.length == 1)
            return;
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void show(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
