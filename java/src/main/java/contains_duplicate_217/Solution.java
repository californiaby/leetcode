package contains_duplicate_217;

import java.util.HashSet;

public class Solution {

  /*
  Given an array of integers, find if the array contains any duplicates.
  Your function should return true if any value appears at least twice in the array,
  and it should return false if every element is distinct.
   */

  public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (set.contains(n)) return true;
      set.add(n);
    }

    return false;
  }

}
