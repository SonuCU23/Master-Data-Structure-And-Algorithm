package arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 10 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7,};

        int[] res = intersection(arr1, arr2);
        for (int i : res)
            System.out.println(i);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
