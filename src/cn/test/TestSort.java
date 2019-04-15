package cn.test;

/**
 * @Author: Nancy
 * @Date: 2019/4/6 15:24
 */
public class TestSort {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        while (!(n % 2 == 1 && n % 3 == 2 && n % 5 == 4 && n % 6 == 5)) {
            count += 1;
            n += 7;
        }
        System.out.println(n + "运行了" + count + "次");
//        System.out.println(Fib(6));
//        int[] arr = {1,4,2,7,5,9,3};
//        for (int i:arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        Sort(arr);
//        for (int i:arr){
//            System.out.print(i + " ");
//        }

    }
//    public static void Sort(int[] arr) {
//
//    }

    public static int Fib(int n) {
        if (n <= 0)
            return -1;
        if (n == 1 || n == 2)
            return 1;
        return Fib(n - 1) + Fib(n - 2);
    }
}
