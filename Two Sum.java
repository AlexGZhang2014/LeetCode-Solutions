Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

Solution:

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        for (int num:nums) {
            numbers.add(new Integer(num));
        }
        for (int index = 0; index < nums.length; index++) {
            List<Integer> slicedNums = numbers.subList(index+1, numbers.size());
            Integer difference = target - nums[index];
            if (slicedNums.contains(difference)) {
                return new int[] {index, slicedNums.indexOf(difference)+index+1};
            }
        }
        return null;
    }
}
