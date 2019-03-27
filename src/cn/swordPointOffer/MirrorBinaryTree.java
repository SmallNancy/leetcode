package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 11:50
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class MirrorBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left =  new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
    }


    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.right != null){
            Mirror(root.right);
        }
        if (root.left != null){
            Mirror(root.left);
        }

    }
}
