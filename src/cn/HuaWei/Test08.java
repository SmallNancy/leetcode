package cn.HuaWei;

import java.util.*;

/**
 * @Author: Nancy
 * @Date: 2019/4/3 15:56
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            for(int i = 0;i < num;i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(map.containsKey(key)) {
                    value += map.get(key);
                }
                map.put(key, value);
            }
            Set set = map.keySet();
            for(Iterator iter = set.iterator(); iter.hasNext();) {
                Integer k = (Integer) iter.next();
                Integer v = (Integer) map.get(k);
                System.out.println(k +" " + v);
            }



        }
    }

}
