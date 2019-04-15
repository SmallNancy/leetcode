package cn.leetCode.数组;

/**
 * @Author: Nancy
 * @Date: 2019/4/10 10:08
 */
public class 买卖股票 {
    public static void main(String[] args) {
        int[]  price ={7,1,5,3,6,4};
        System.out.println( maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
       int maxprice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                maxprice += prices[i+1] - prices[i];
            }
        }
        return maxprice;

    }
}
