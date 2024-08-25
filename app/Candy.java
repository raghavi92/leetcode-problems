import java.util.Arrays;

public class Candy {

    public void candyLeft(int[] ratings, int[] candies, int currentChild) {

        int prevChildIndex = currentChild - 1;

        // int nextChildIndex = currentChild + 1;

        if (prevChildIndex >= 0 && ratings[prevChildIndex] < ratings[currentChild]
                && candies[prevChildIndex] >= candies[currentChild]) {
            candies[currentChild] = candies[prevChildIndex] + 1;

        }

    }

    public void candyRight(int[] ratings, int[] candies, int currentChild) {

        int nextChild = currentChild + 1;

        if (ratings[currentChild] > ratings[nextChild]
                && candies[currentChild] <= candies[nextChild]) {
            candies[currentChild] = candies[nextChild] + 1;
        }

    }

    public int candy(int[] ratings) {

        int currentChild = 0;

        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        while (currentChild < ratings.length) {
            candyLeft(ratings, candies, currentChild);

            currentChild++;
        }

        currentChild = ratings.length - 2;

        while (currentChild >= 0) {
            candyRight(ratings, candies, currentChild);
            currentChild--;
        }

        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            System.out.println(candies[i]);
            sum += candies[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Candy().candy(new int[] { 1, 2, 2 }));
    }
}
