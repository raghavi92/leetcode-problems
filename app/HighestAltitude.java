public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int al[] = new int[gain.length + 1];

        al[0] = 0;
        int maxAl = al[0];

        for (int i = 0; i < gain.length; i++) {
            al[i + 1] = gain[i] + al[i];

            if (maxAl < al[i + 1]) {
                maxAl = al[i + 1];
            }
        }

        return maxAl;

    }

    public static void main(String[] args) {
        HighestAltitude ha = new HighestAltitude();
        System.out.println(ha.largestAltitude(new int[] { -4, -3, -2, -1, 4, 3, 2 }));
    }
}
