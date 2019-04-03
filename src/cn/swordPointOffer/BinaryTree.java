package cn.swordPointOffer;

import java.util.ArrayList;

/**
 * @Author: Nancy
 * @Date: 2019/4/1 16:50
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 */
public class BinaryTree {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            list.add(root.val);
        TreeNode temp = root;


        return list;
    }


}
