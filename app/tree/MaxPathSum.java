package tree;

public class MaxPathSum {

    int max;

    public MaxPathSum() {
        max = Integer.MIN_VALUE;
    }

    private int maxPathSumH(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPathSumH(root.left));

        int rightSum = Math.max(0, maxPathSumH(root.right));

        this.max = Math.max(max, leftSum + rightSum + root.val);

        return Math.max(leftSum, rightSum) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        this.maxPathSumH(root);

        return this.max;
    }

    public static void main(String[] args) {
        // Integer[] arr = new Integer[] { -10, 9, 20, null, null, 15, 7 };
        // Integer[] arr = new Integer[] { 1, 2, 3 };
        Integer[] arr = new Integer[] { 2, -1 };

        TreeNode root = Utils.build(arr, 0);
        System.out.println(new MaxPathSum().maxPathSum(root));
    }
}
