package arrays.Day6;

import java.util.Scanner;

public class CircularSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int length = circularSubArray(arr, n);
        System.out.println(length);
    }

    public static int circularSubArray(int[] nums, int n){
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            int curr_sum = 0;
            int curr_max = 0;
             for(int j = i; j <  nums.length; j++){
                int index = (i + j) % nums.length;
                curr_sum += nums[j % nums.length];
                curr_max = Math.max(curr_max, curr_sum);
            }
            maxSum = Math.max(maxSum, curr_max);
        }
        return maxSum;
    }
}
