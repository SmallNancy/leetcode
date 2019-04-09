package cn.swordPointOffer;

/**
 * Created by NancySmall
 * on 2019/4/9
 * 二叉搜索树后序遍历
 **/
public class PostOrder {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0)
            return false;
       return isBinartSelectTree(sequence,0,sequence.length - 1);

    }
    public boolean isBinartSelectTree(int[] seq,int start,int end){
        if (end <= start)
            return true;
        int i = start;
        for (; i< end ;i++) {
            if (seq[i] > seq[end])
                break;
        }
        int j = i;
        for ( ;j <= end - 1;j++){
            if (seq[j] < seq[end])
                return false;
        }
        return isBinartSelectTree(seq,start, i - 1) && isBinartSelectTree(seq,i ,end - 1);
    }



}
