public class Utils {
    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i);
        }
    }

    public static void print2dArray(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            printArray(nums[i]);
            System.out.println();
        }
    }
}
