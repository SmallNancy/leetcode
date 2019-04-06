package cn.leetCode;

import java.util.*;

/**
 * @Author: Nancy
 * @Date: 2019/4/4 16:52
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] num = {0,3,0,1,1,-1,-5,-5,3,-3,-3,0};

        System.out.println(threeSum(num).toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> list = null;
        for (int i = 0 ; i < nums.length -2; i++) {
            for (int j = i +1; j < nums.length -1;j++) {
                for (int k = j+1;k < nums.length;k++) {
                    if (nums[j] + nums[i] + nums[k] == 0) {
                        list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        temp.add(list);
                        break;
                    }
            }
        }

        }

        for(int i = 0;i<temp.size() - 1;i++){
            for(int j = i+1;j<temp.size() ;j++){
                if(i!=j){
                    boolean b1 = false;
                    boolean b2 = false;
                    boolean b3 = false;

                    for(int k = 0;k<3;k++){
                        if (temp.get(i).get(0)==temp.get(j).get(k)){
                            b1 = true;

                        }
                        if(temp.get(i).get(1)==temp.get(j).get(k)){
                            b2 = true;
                        }
                        if (temp.get(i).get(2)==temp.get(j).get(k)){
                            b3 = true;
                        }
                    }
                    if(b1&&b2&&b3){
                        temp.remove(j);
                        j--;
                    }
                }
            }
        }
        return temp;

    }
}
