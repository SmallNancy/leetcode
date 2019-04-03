package cn.HuaWei;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 14:09
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * 输入:    I am a boy
 * 输出:    boy a am I
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String sentence = sc.nextLine();
            System.out.println(reverse(sentence));;
        }
    }

    /**
     * 反转句子
     * @param sentence 原句子
     * @return 反转后的句子
     */
    public static String reverse(String sentence) {
        String str[] = sentence.split(" ");
        String temp = "";
        for(int i = str.length - 1;i >= 0;i--) {
            temp += str[i] +" ";
        }
        return temp.substring(0, temp.length()-1);
    }
}
