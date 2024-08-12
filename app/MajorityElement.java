class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, majorityElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;

            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        MajorityElement e = new MajorityElement();
        System.out.println(e.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));

    }
}