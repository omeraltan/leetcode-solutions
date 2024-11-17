package com.leetcode.easy;

/**
 *      Two - Sum
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] result = twoSum(nums, target);
        String a = "";
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            a += result[i];
            if (i != result.length - 1) {
                a +=",";
            }
        }
        System.out.print(a+"]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

}
