package max_consecutive_ones_485;

public class Solution {

  /**
   * Given a binary array, find the maximum number of consecutive 1s in this array.

   Example 1:
   Input: [1,1,0,1,1,1]
   Output: 3
   Explanation: The first two digits or the last three digits are consecutive 1s.
   The maximum number of consecutive 1s is 3.
   */

  public int findMaxConsecutiveOnes(int[] nums) {
    int ans = 0;
    int start = 0;
    int end = 0;

    while (start < nums.length && end < nums.length) {

      start = end;
      // move start until you meet '1' or end of array
      while (start < nums.length && nums[start] != 1) {
        start++;
      }

      // move end to start
      end = start;

      // move end until you meet '0' or end of array
      while (end < nums.length && nums[end] != 0) {
        end++;
      }

      // start and end point to beginning and end of sequence accordingly
      int l = end - start;
      ans = l > ans ? l : ans;
    }

    return ans;
  }
}
