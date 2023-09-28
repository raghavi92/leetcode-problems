public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int currentArea = height[i] < height[j] ? height[i] * (j - i) : height[j] * (j - i);
            if(currentArea > maxArea) {
                maxArea = currentArea;
            }
            if(height[i] < height[j])  {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        MaxArea m = new MaxArea();
        int maxArea = m.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        if(maxArea != 49) {
            throw new RuntimeException();
        }

    }
}
