package tree;

public class SumRootToLeaf {

    private int sumNumbers(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return (sum * 10) + root.val;
        }

        return sumNumbers(root.left, (sum * 10) + root.val) + sumNumbers(root.right, (sum * 10) + root.val);

    }

    public static void main(String[] args) {
        // System.out.println(new SumRootToLeaf().sumNumbers(Utils.build(new Integer[] {
        // 4, 9, 0, 5, 1 }, 0), 0));
        // System.out.println(new SumRootToLeaf().sumNumbers(Utils.build(new Integer[] {
        // 1, 2, 3 }, 0), 0));
        System.out.println(new SumRootToLeaf().sumNumbers(Utils.build(new Integer[] { 1, 0 }, 0), 0));
    }
}
