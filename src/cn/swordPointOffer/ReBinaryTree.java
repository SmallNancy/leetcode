package cn.swordPointOffer;

import java.util.Scanner;

/**
 * @Author: Nancy
 * @Date: 2019/3/19 21:14
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class ReBinaryTree {
    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        System.out.println(reConstructBinaryTree(pre,in));
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = rebuildTree(pre,0,pre.length - 1,in,0,in.length -1);
        return root;
    }

    public static TreeNode rebuildTree(int[] pre, int startpre, int endpre, int[] in, int startin, int endin) {
        if (startpre > endpre || startin > endin)
            return null;
        TreeNode root = new TreeNode(pre[startpre]);
        for (int i = startin;i < in.length; i++){
            if (in[i] == pre[startpre]){
                root.left = rebuildTree(pre, startpre  + 1, startpre + i - startin, in, startin, i - 1);
                root.right = rebuildTree(pre, startpre  + i - startin + 1, endpre, in, i + 1, endin);
                break;
            }
        }
        return root;
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
