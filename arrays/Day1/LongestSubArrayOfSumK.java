package arrays.Day1;

import java.util.Scanner;

/* Longest Sub Array with given Sum K(Positives)
 * 
 *  Input : [ 1,2,3,1,1,1,4,2,3 ]
 *  Output : 3
 * 
 */

public class LongestSubArrayOfSumK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int k = scn.nextInt();
        int maxLength = maxSubArrayOfSumK(arr, n, k);
        System.out.println(maxLength);
    }

    public static int maxSubArrayOfSumK(int[] arr, int n, int k) {

        int left = 0, right = 0; // 2 pointers
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += arr[right];
        }

        return maxLen;
    }
}