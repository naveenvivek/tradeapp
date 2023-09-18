package com.naveen;

import java.util.Arrays;

public class BuySellStock {

    public static int calc(int[] a) {

        //Ignore zero profit and loss scenarios

        //Find first buying point.
        //if(i<i+1)  then consider else skip to next point

        //Find first selling point

        return 0;
    }

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return findMaximumProfit(0, 1, prices, dp);
    }

    static int findMaximumProfit(int i, int k, int[] prices, int[][] dp) {

        if (i == prices.length) return 0;
        if (dp[i][k] != -1) return dp[i][k];
        int profit = 0;
        if (k == 1) {
            int buy = -prices[i] + findMaximumProfit(i + 1, 0, prices, dp);
            int notBuy = findMaximumProfit(i + 1, 1, prices, dp);
            profit = Math.max(buy, notBuy);
        } else {
            int sell = prices[i] + findMaximumProfit(i + 1, 1, prices, dp);
            int notSell = findMaximumProfit(i + 1, 0, prices, dp);
            profit = Math.max(sell, notSell);
        }

        return dp[i][k] = profit;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 15, 4};


        int n = a.length;
        int max_profit = maxProfit(a);
        System.out.println(max_profit);
    }
}
