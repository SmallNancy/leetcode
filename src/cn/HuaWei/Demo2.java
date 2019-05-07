package cn.HuaWei;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
        }
        int N = sc.nextInt();
        String s = sc.next();
        int i = 0;
        int count = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                count++;
                StringBuilder temp = new StringBuilder();
                i++;
                while (s.charAt(i) != '0' && s.charAt(i) != '1' && i < s.length()) {
                    temp.append(s.charAt(i));
                    i++;
                }
                System.out.print(temp.toString());
                if (count < N) {
                    System.out.print(" ");
                }
            }
            else if (s.charAt(i) == '0') {
                count++;
                i++;
                StringBuilder temp = new StringBuilder();
                while (i < s.length() && s.charAt(i) != '0' && s.charAt(i) != '1') {
                    temp.append(s.charAt(i));
                    i++;
                }
                System.out.print(temp.reverse().toString());
                if (count < N){
                    System.out.print(" ");
                }
            }
        }
    }
}
