package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 12:27
 */
public class RotateArray {

    public int minNumberInRotateArray(int [] array) {
        int min = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] < min){
                return array[i];
            }
        }
        return min;
    }
}
