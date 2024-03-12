package arrays.Day4;

import java.util.Scanner;

// LeetCode -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class StockBuyAndSellPart2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = scn.nextInt();

        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i -1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }
}
