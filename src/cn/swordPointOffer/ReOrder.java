package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 15:48
 *  数组排序
 * 奇数在前，偶数在后
 */
public class ReOrder {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7};
        reOrderArray(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reOrderArray(int [] array) {
        for(int i = 0;i < array.length; i++){
            for(int j = i; j > 0;j--){
                if(array[j - 1] % 2 == 0 && array[j] % 2 == 1){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}
