package tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftDepth = 0, rightDepth = 0;

        if (root.left != null) {
            leftDepth = maxDepth(root.left);
        }

        if (root.right != null) {
            rightDepth = maxDepth(root.right);
        }

        if (leftDepth >= rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;

        }

    }

    public static void main(String[] args) {
        // Integer[] arr = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        Integer[] arr = new Integer[] { 1, null, 2 };

        TreeNode root = Utils.build(arr, 0);

        System.out.println(new MaxDepth().maxDepth(root));
    }
}
