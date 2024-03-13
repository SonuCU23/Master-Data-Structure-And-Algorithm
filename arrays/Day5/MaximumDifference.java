package arrays.Day5;

import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int maxDiff = maxDifference(arr, n);
        System.out.println(maxDiff);
    }

    public  static int maxDifference(int[] arr, int n){

        int maxDiff = arr[1] - arr[0];
        int min = arr[0];

        for(int i = 0; i < n; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        return maxDiff;
    }
}
