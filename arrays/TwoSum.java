package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {


    class Pair implements Comparable<Pair> {
        int index;
        int value;

        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }

        public int compareTo(Pair p){
            return this.value - p.value;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();

        TwoSum obj = new TwoSum();
        int[] res = obj.twoSum(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
    public int[] twoSum(int[] nums, int target) {

        Pair[] pairs = new Pair[nums.length];
        for(int i = 0; i < nums.length; i++){
            pairs[i] = new Pair(nums[i], i);
        }

        Arrays.sort(pairs);

        int[] res = new int[2];

        int lt = 0;
        int rt = pairs.length - 1;
        while(lt < rt){

            int left = pairs[lt].value;
            int right = pairs[rt].value;

            if(left + right == target){
                res[0] = pairs[lt].index;
                res[1] = pairs[rt].index;
                break;
            }
            else if(left + right < target)
                lt++;
            else
                rt--;
        }
        return res;
    }

}
