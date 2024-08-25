public class BestTimeToBuyAndSellStocks2 {
    public int getProfit(int startIndex, int[] prices) {
        if (startIndex >= prices.length)
            return 0;

        int endIndex = startIndex + 1;
        int sellPrice = prices[startIndex];
        while (endIndex < prices.length && sellPrice < prices[endIndex]) {
            if (prices[startIndex] > prices[endIndex]) {
                break;
            }
            sellPrice = prices[endIndex];
            endIndex++;
        }

        return (sellPrice - prices[startIndex]) + getProfit(endIndex, prices);
    }

    public int maxProfit(int[] prices) {
        return getProfit(0, prices);
    }

    public static void main(String[] args) {
        // System.out.println(new BestTimeToBuyAndSellStocks2().maxProfit(new int[] { 1,
        // 2, 3, 4, 5 }));
        // System.out.println(new BestTimeToBuyAndSellStocks2().maxProfit(new int[] { 7,
        // 1, 5, 3, 6, 4 }));

        System.out.println(new BestTimeToBuyAndSellStocks2().maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}
