
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int indexToBeFilled = 1, i = 1, currentNum = nums[0];

        while (i < nums.length) {
            if (currentNum != nums[i]) {
                nums[indexToBeFilled] = nums[i];
                currentNum = nums[i];
                indexToBeFilled++;
            }

            i++;
        }

        return indexToBeFilled;

    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray s = new RemoveDuplicatesFromSortedArray();

        // int[] input = new int[] { 1, 1, 2 };

        int[] input = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println(s.removeDuplicates(input));
        System.out.println("******");
        printArray(input);
    }
}
