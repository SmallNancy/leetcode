package cn.swordPointOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: Nancy
 * @Date: 2019/4/1 16:50
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 */
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        //root.right.right = new TreeNode(11);
        System.out.println(PrintFromTopToBottom(root).toString());
    }



    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
           TreeNode t = queue.pop();
            list.add(t.val);
            if (t.left != null) queue.add(t.left);
            if (t.right != null) queue.add(t.right);
        }
        return list;

    }



}
