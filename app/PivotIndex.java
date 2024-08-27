public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, prefixSum = 0;
        for (int i : nums) {
            totalSum += i;
        }

        for (int i = 0; i < nums.length; i++) {

            if (prefixSum == (totalSum - prefixSum - nums[i])) {
                return i;
            }

            prefixSum += nums[i];
        }
        return -1;
    }

    // public int pivotIndex2(int[] nums) {
    //     int i = 1, j = nums.length - 2;

    //     int prefixSum = nums[0], suffixSum = nums[nums.length - 1];

    //     while (i <= j) {

    //         if (prefixSum == suffixSum && (j == i)) {
    //             return i;
    //         }

    //         if ((prefixSum + nums[i]) < (suffixSum + nums[j])) {
    //             prefixSum += nums[i];
    //             i++;
    //         } else {
    //             suffixSum += nums[j];
    //             j--;
    //         }
    //     }

    //     return -1;
    // }

    public static void main(String[] args) {
        PivotIndex i = new PivotIndex();

        System.out.println(i.pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
        System.out.println(i.pivotIndex(new int[] { 1, 2, 3 }));
        System.out.println(i.pivotIndex(new int[] { 2, 1, -1 }));
        System.out.println(i.pivotIndex(new int[] { -1, -1, -1, -1, -1, 0 }));
    }
}
