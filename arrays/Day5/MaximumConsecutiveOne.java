package arrays.Day5;

import java.util.Scanner;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int maxOne = maximumConsecutiveOne(arr, n);
        System.out.println(maxOne);
    }

    public static int maximumConsecutiveOne(int[] arr, int n){
        int maxOne = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]!= 1){
                maxOne = Math.max(maxOne, count);
                count = 0;
            }else{
                count++;
            }
        }
        return maxOne;
    }
}
