public class MergeSortedArray {
    private void shiftRight(int[] nums, int m, int from) {
        for (int i = m - 1; i >= from; i--) {
            nums[i + 1] = nums[i];

        }
        nums[from] = 0;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = 0, j = 0;

        while (j < n) {
            if (nums1[i] < nums2[j] && i < m + j) {
                i++;
                continue;
            } else if (nums1[i] < nums2[j]) {
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                shiftRight(nums1, m + j, i);
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray m = new MergeSortedArray();
        // int[] input = new int[] { 1, 2, 3, 0, 0, 0 };
        // m.merge(input, 3, new int[] { 2, 5, 6 }, 3);

        // int[] input = new int[] { 1 };
        // m.merge(input, 1, new int[] {}, 0);
        // int[] input = new int[] { 0 };
        // m.merge(input, 0, new int[] { 1 }, 1);

        // int[] input = new int[] { 2, 0 };
        // m.merge(input, 1, new int[] { 1 }, 1);

        int[] input = new int[] { 4, 5, 6, 0, 0, 0 };
        m.merge(input, 3, new int[] { 1, 2, 3 }, 3);

        System.out.println(input);
    }
}
