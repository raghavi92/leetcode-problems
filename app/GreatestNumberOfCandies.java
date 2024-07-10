import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean r[] = new Boolean[candies.length];

        int greatestNoOfCandies = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatestNoOfCandies) {
                greatestNoOfCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatestNoOfCandies) {
                r[i] = true;
            } else {
                r[i] = false;
            }
        }

        return Arrays.asList(r);

    }
}
