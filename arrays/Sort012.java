package arrays;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        
        sort012(arr,n);
        for(int element : arr)
            System.out.print(element + " ");
    }

    public static void sort012(int[] arr, int n){

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; i++)
            if(arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else
                count2++;
        
        for(int i = 0; i < n; i++){
            if(count0 > 0){
                arr[i] = 0;
                count0--;
            }else if(count1 > 0){
                arr[i] = 1;
                count1--;
            }else{
                arr[i] = 2;
                count2--;
            }
        }
    }
}
