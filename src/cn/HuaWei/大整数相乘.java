package cn.HuaWei;

public class 大整数相乘 {
    public static void main(String[] args) {
        String s1 = "783312232323345";
        String s2 = "3912125656767878";

        //TODO:1.将大整数分别转化为字符数组
        int[] arrayA = new int[s1.length()];
        int[] arrayB = new int[s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            arrayA[i] = s1.charAt(i)- '0';
        }
        for (int i = 0; i < s2.length(); i++) {
            arrayB[i] = s2.charAt(i) - '0';
        }



        //TODO:2.每位相乘结果放在结果数组中
        int[] res = new int[s1.length()+s2.length()];
        for(int i = arrayA.length - 1; i >= 0;i--) {
            for(int j = arrayB.length - 1; j >= 0; j--) {
                res[i+j+1] += arrayA[i] * arrayB[j]; // 相同位置需要累加
            }
        }

        //TODO:3.整理结果数组，进位处理
        int carray = 0;
        for(int i = res.length - 1; i >= 0;i--) {
            res[i] = res[i] + carray;
            if (res[i] >= 10) {
                carray = res[i]/10;
                res[i] %= 10;
            }
        }

        //TODO:4.转换成字符串输出，注意第一位可能为0的情况
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0) {
                continue;
            }
            sb.append(res[i]);
        }
        System.out.println(sb.toString());
    }
}
