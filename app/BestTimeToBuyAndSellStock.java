public class BestTimeToBuyAndSellStock {
    public int profit(int[] prices, int buyIndex, int sellIndex) {
        if (buyIndex > sellIndex)
            return 0;
        return prices[sellIndex] - prices[buyIndex];
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length - 1; j > i; j--) {
                int currentProfit = profit(prices, i, j);

                if (currentProfit > maxProfit)
                    maxProfit = currentProfit;
            }
        }

        return maxProfit;

    }

    public int maxProfit2(int[] prices) {
        int maxProfit = 0, buyPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if (profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();
        System.out.println(s.maxProfit2(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

}
