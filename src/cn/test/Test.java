package cn.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/4 16:09as
 */
public class Test {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
           Scanner sc = new Scanner(System.in);
           while (sc.hasNext()) {
               String str = sc.next();
               StringBuilder sb = new StringBuilder();
               HashMap<String,Integer> map = new HashMap<>();
               String temp = "";
               for (int i = 0; i < str.length(); ) {
                   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                      temp += str.charAt(i);
                      i++;
                   }else {
                       int n = 0;
                       while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                           n = 10 * n +str.charAt(i) - '0';
                           i++;
                       }
                       map.put(temp,n);
                       for (int j = 0; j < n; j++) {
                           sb.append(temp);
                       }
                       temp = "";
                   }
               }
               System.out.println(sb.toString());
           }


        }
}
