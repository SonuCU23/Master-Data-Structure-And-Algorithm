package arrays.Day4;

import java.util.Scanner;

// LeetCode -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class StockBuyAndSell {
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
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
