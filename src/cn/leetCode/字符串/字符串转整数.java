package cn.leetCode.字符串;

public class 字符串转整数 {
    public static void main(String[] args) {
        String str = "-42";
       // System.out.println(Integer.MIN_VALUE);
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
       str = str.trim();
       char[] c = str.toCharArray();
       if (c.length == 0) {
           return 0;
       }
       int index = 1;
       int i = 0;
       if (c[0] == '-') {
           index = -1;
           i++;
       }else if (c[0] == '+') {
           i++;
       }else if (!(c[0] >= '0' && c[0] <= '9')) {
           return 0;
       }
       long result = 0;
       while (i < c.length && c[i] >= '0' && c[i] <= '9') {
           result = result * 10 + (c[i] - '0');
           i++;
           if(result > Integer.MAX_VALUE){
            if (index == 1) {
               if(result > Integer.MAX_VALUE) {
                   return Integer.MAX_VALUE;
               }
            } else {
               return Integer.MIN_VALUE;
            }
           }
       }
       return  index * (int)result;
    }
}
