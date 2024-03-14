package arrays.Day6;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = majorityElement(arr);
        System.out.println(majorityElement);
    }

    public static int majorityElement(int[] nums) {

        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (nums.length / 2)) return el;
        return -1;
    }
}


