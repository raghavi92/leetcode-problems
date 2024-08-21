import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        Arrays.fill(res, 1);

        int currentProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = currentProduct;

            currentProduct *= nums[i];
        }

        currentProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * currentProduct;

            currentProduct *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        ProductExceptSelf p = new ProductExceptSelf();

        int[] productExceptSelf = p.productExceptSelf(new int[] { -1, 1, 0, -3, 3 });

        Utils.printArray(productExceptSelf);
    }
}
