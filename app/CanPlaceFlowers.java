public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] > 1 && n == 0 || flowerbed[0] == 0 && n == 1;
        }
        int planted = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i + 1] == 0 && flowerbed[i] != 1) {

                    flowerbed[i] = 1;
                    planted++;

                    if (planted == n) {
                        return true;
                    }
                }
                continue;

            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] != 1) {

                    flowerbed[i] = 1;
                    planted++;
                    if (planted == n) {
                        return true;
                    }
                }
                continue;

            } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                if (flowerbed[i] != 1) {

                    flowerbed[i] = 1;
                    planted++;
                    if (planted == n) {
                        return true;
                    }
                }
                continue;

            }

        }

        return false;
    }

    public static void main(String[] args) {
        CanPlaceFlowers c = new CanPlaceFlowers();
        System.out.println(c.canPlaceFlowers(new int[] { 0, 1, 0 }, 1));
    }
}
