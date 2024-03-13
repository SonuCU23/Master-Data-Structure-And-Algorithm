package arrays.Day5;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        int water = trappingRainWater(arr, n);
        System.out.println(water);
    }

    public static int trappingRainWater(int[] arr , int n){

        int left[] = new int[n];
        left[0] = arr[0];
        for(int i = 0; i < n; i++)
            left[i] = Math.max(left[i-1], arr[i]);

        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n - 2; i >= 0; i++)
            right[i] = Math.max(right[i+1], arr[i]);

        int water = 0;
        for(int i = 0; i < n; i++){
            water += Math.min(left[i], right[i]) - arr[i];
        }
        return water;
    }
}
