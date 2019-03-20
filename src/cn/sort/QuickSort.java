package cn.sort;

/**
 * @Author: Nancy
 * @Date: 2019/3/20 13:56
 *
 * Quick Sort: bubble Sort improved
 * Time Complexity: O(nlogn)  不稳定
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,7,8};
        SellSort.show(arr);
        Qsort(arr,0,arr.length - 1);
        SellSort.show(arr);
    }

    public static void Qsort(int[] arr,int low,int high){
        int l = low;
        int h = high;
        if (low >= high)
            return;
        int key = arr[l];
        while (l < h){
            while(l < h && key <= arr[h]){
                h--;
            }
            if (l < h){
                arr[l++] = arr[h];
            }
            while (l < h && key >= arr[l]){
                l++;
            }
            if (l < h){
                arr[h--] = arr[l];
            }
            arr[l] = key;
            Qsort(arr,low,h-1);
            Qsort(arr,h + 1,high);
        }
    }
}
