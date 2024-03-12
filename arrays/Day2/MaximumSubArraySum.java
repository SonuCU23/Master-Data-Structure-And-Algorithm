package arrays.Day2;

import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int sum = maximumSubArraySum(arr, n);
        System.out.println(sum);
    }

    public static int maximumSubArraySum(int[] arr, int n){
       int csum = arr[0]; // current sum
       int osum = arr[0]; // overall sum
       for(int i = 1; i < n; i++){
            if(csum >= 0){
                csum += arr[i];
            }else{
                csum = arr[i];
            }

            osum = Math.max(osum, csum);
       }

        return osum;
    }
}
