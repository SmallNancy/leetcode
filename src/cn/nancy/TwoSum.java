package cn.nancy;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,5};
        int[] arr = twoSum(num,9);
        for (int i:arr){
            System.out.print(i +" ");
        }

    }
    public static int[] twoSum(int[] numbers, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < numbers.length;i++){
            Integer temp = map.get(target - numbers[i]);
            if(temp == null){
                map.put(numbers[i],i);
            }else {
                return new int[] {temp,i};
            }
        }
        return null;
    }
}
