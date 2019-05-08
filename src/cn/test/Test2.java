package cn.test;

public class Test2 {
    public static void main(String[] args) {
        int n = 5;
        back(n,n,"");
    }
    public static void back(int left,int right,String s){

        //1
        if(left==0&&right==0){
            System.out.println(s);
        }

        //2
        if(left>0){
            String temp = s;
            s+="(";
            back(left-1,right,s);
            s = temp;
        }
        if(right>0&&right>left){
            String temp = s;
            s+=")";
            back(left,right-1,s);
            s = temp;
        }
    }
}
