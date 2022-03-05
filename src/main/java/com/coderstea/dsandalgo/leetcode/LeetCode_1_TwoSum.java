package com.coderstea.dsandalgo.leetcode;

import java.util.HashMap;

/**
 * LeetCode Problem
 * Link: https://leetcode.com/problems/two-sum/
 * LeetCode Solution Link:
 * https://leetcode.com/problems/two-sum/discuss/1821115/Java-or-Explaination-or-HashMap-or-CodersTea.com
 */
public class LeetCode_1_TwoSum {
  /**
   * @param nums   array
   * @param target target
   * @return index of values that adds upto target
   * Approach:
   * 1. create an integer map
   * 2. check if (target - nums[i]) exist? goto 3rd else go to 4th step
   * 3. return array of i and the value of target-nums[i] key in the map and exit
   * 4. add nums[i] and i in the map as key and value respectively and continue the loop
   * <p>
   * Complexity:
   * Time: O(n) -> doing this in a single loop
   * Space : O(n) -> using hashmap to store previous values
   */
  public int[] twoSum(int[] nums, int target) {
    //  empty map
    var prevValuesMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      // value needed to add to current number to make target
      int expectedPrevValue = target - nums[i];

      // if expectedPrevValue is in the prevValuesMap return the value and current index
      if (prevValuesMap.containsKey(expectedPrevValue)) {
        return new int[]{prevValuesMap.get(expectedPrevValue), i};
      }
      // else just put the current number and index in the prevValuesMap
      prevValuesMap.put(nums[i], i);
    }

    // redundant as problem states there WILL be a ONE solution
    return null;
  }
}
