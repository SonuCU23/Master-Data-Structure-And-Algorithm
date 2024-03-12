package arrays.Day3;

import java.util.HashMap;
import java.util.Scanner;

/*
    Count Elements With Maximum Frequency : https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2024-03-08

    You are given an array nums consisting of positive integers. Return the total frequencies of elements in nums such that
    those elements all have the maximum frequency. The frequency of an element is the number of occurrences of that element
    in the array.

    Example 1:

    Input: nums = [1,2,2,3,1,4]
    Output: 4
    Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
    So the number of elements in the array with maximum frequency is 4.
*
* */

public class CountElementsFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int count = countElementFrequency(arr, n);
        System.out.println(count);
    }

    public  static int countElementFrequency(int[] arr, int n){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;

        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        int count = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                count += maxFrequency;
            }
        }


        return count;
    }
}
