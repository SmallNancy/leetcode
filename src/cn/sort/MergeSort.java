package cn.sort;

/**
 * @Author: Nancy
 * @Date: 2019/3/20 15:10
 *
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,9,3};
        show(arr);
        mergeArr(arr);
        show(arr);

    }

    public static void mergeArr (int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        sortProsess(arr,0,arr.length - 1);

    }

    public static void sortProsess(int[] arr,int L,int R) {
        if (L == R) {
            return;
        }
        int mid = (L + R) >> 1;
        sortProsess(arr,L,mid);
        sortProsess(arr,mid + 1,R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr,int L,int mid,int R) {
        int[] help = new int[R - L + 1];
        int i = 0;   // 辅助数组下标
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] :arr[p1++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[L+j] = help[j];
        }

    }

    public static void show(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
