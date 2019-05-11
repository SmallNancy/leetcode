package cn.sort;

/**
 * 小和问题 和归并排序原理一样
 * 合并前先找出左边(p1)的比右边(p2)大的数字，
 *   res += p1*(R-P1)
 */
public class MinSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        show(arr);
        System.out.println(mergeSort(arr));
        show(arr);
    }


    public static int  mergeSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return 0;
        return SortProsse(arr,0,arr.length - 1);
    }

    public static int SortProsse(int[] arr,int L,int R) {
        if (L == R)
            return 0;
        int mid = (L + R) >> 1;
        return SortProsse(arr,L,mid) +
                SortProsse(arr,mid + 1,R) +
                merge(arr,L,mid,R);

    }
    public static int merge(int[] arr,int L,int mid,int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= R) {
            res += arr[p1] < arr[p2] ? arr[p1] * (R - p2 + 1) : 0;
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] :arr[p1++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (int j = 0; j< help.length; j++) {
            arr[L+j] = help[j];
        }

        return res;
    }


    public static void show(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
