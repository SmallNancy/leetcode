package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 9:22
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class SubTreeTest {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left = new TreeNode(8);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);
        System.out.println(HasSubtree(root1,root2));

    }

    /**
     * 判断B是不是A的子树
     * @param root1
     * @param root2
     * @return
     */
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if (root1 != null && root2 != null){
            if (root1.val == root2.val){
                flag = isSubTree(root1,root2);

            }
            if (!flag){
                flag = isSubTree(root1.left,root2);
                if (!flag){
                    flag = isSubTree(root1.right,root2);
                }
            }

        }
        return flag;

    }

    private static boolean isSubTree(TreeNode root1,TreeNode root2){
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return  isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
    }
}


// class TreeNode {
//   int val = 0;
//   TreeNode left = null;
//   TreeNode right = null;
//
//   TreeNode(int val) {
//     this.val = val;
//   }
//
// }
