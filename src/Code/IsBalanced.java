package Code;


/**
 * Created by lisheng on 17-5-26.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        boolean flag = true;
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            flag = false;
        }
        return flag && isBalanced(root.right) && isBalanced(root.left);
    }

    /**
     * 计算该节点的树高
     *
     * @param node
     * @return
     */
    public int getHeight(TreeNode node) {
        if (node == null)
            return 0;
        int count = 1;
        return Math.max(count + getHeight(node.left), count + getHeight(node.right));
    }

    public static void main(String[] args) {
        IsBalanced balance = new IsBalanced();
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        root.left = node1;

//        root.right = node2;
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        System.out.println(balance.isBalanced(root));
//        System.out.println(balance.getHeight(root.right));

    }


}
