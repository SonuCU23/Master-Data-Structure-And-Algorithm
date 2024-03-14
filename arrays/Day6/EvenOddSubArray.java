package arrays.Day6;

import java.util.Scanner;

public class EvenOddSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int length = maxLengthSubArray(arr, n);
        System.out.println(length);
    }

    public static int maxLengthSubArray(int[] arr, int n){

        int maxLength = 1;
        int length = 1;
        for(int i = 1; i < n; i++){
            if((arr[i - 1]%2 != 0 && arr[i]%2 == 0) || (arr[i - 1]%2 == 0 && arr[i]%2 != 0) ){
                length++;
                maxLength = Math.max(maxLength, length);
            }else{
                length = 1;
            }
        }
        return length;
    }
}

