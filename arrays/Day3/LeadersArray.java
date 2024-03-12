package arrays.Day3;

/*
* Leaders in an array : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
* Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if
  it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2

* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        ArrayList<Integer> res = leadersInAnArray(arr);
        for (Integer element : res) {
            System.out.print(element + " ");
        }
    }

    public static ArrayList<Integer> leadersInAnArray(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();

        res.add(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >=0; i--){
            if(arr[i] >= res.get(res.size() - 1))
                res.add(arr[i]);
        }

        Collections.reverse(res);

        return res;
    }
}
