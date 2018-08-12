package Split_Array_into_Consecutive_Subsequences_659;

/*
You are given an integer array sorted in ascending order (may contain duplicates),
you need to split them into several subsequences, where each subsequences consist of
at least 3 consecutive integers. Return whether you can make such a split.

Input: [1,2,3,3,4,5]
Output: True
Explanation: You can split them into two consecutive subsequences :
1, 2, 3
3, 4, 5
 */

import java.util.HashMap;

public class Solution {
  public boolean isPossible(int[] nums) {

    // Initialize map for storing all numbers and tailMap for storing number which are first post-sequence
    CounterMap map = new CounterMap();
    CounterMap tails = new CounterMap();

    // Populate the map
    for (int x : nums) map.add(x, 1);

    // Iterate through the array
    for (int x : nums) {
      if (map.get(x) == 0) {                                // skip already processed
        continue;

      } else if (tails.get(x) > 0) {                        // add current number to tails
        tails.add(x, -1);                                   // remove the consumed tail
        tails.add(x+1, 1);                                  // add a tail with the following number

      } else if (map.get(x+1) > 0 && map.get(x+2) > 0) {    // can create a new sequence
        map.add(x+1, -1);                                   // process the next number (x+1)
        map.add(x+2, -1);                                   // process the following number (x+2)
        tails.add(x+3, 1);                                  // add the following number to tails (x+3)

      } else {                                              // unprocessed number, can't start sequence, can't be added
        return false;                                       // fail
      }
      map.add(x, -1);                                       // done processing the current number
    }



    return true;
  }

  class CounterMap extends HashMap<Integer, Integer>{
    public int get(int key) {
      return containsKey(key) ? super.get(key) : 0;
    }

    public void add(int key, int value) {
      super.put(key, get(key) + value);
    }
  }
}
