package tree;

public class Utils {
    public static TreeNode build(Integer[] arr, int level) {

        if (level >= arr.length) {
            return null;
        }

        Integer rootValue = arr[level];

        if (rootValue == null) {
            return null;
        }

        TreeNode lefNode = build(arr, (2 * level) + 1);

        TreeNode rightNode = build(arr, (2 * level) + 2);

        return new TreeNode(rootValue, lefNode, rightNode);

        // return root;
    }
}
