package count_binary_substrings_696;

public class Solution {

  /*
  Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's,
  and all the 0's and all the 1's in these substrings are grouped consecutively.
   */

  public int countBinarySubstrings(String s) {

    if (s.length() < 2) return 0;

    int[] groups = new int[s.length()];
    int p = 0;

    groups[p] = 1;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i-1) != s.charAt(i)) {
        // found breakpoint
        p++;
        groups[p] = 1;
      } else {
        groups[p]++;
      }
    }

    int ans = 0;

    for (int i = 1; i < groups.length; i++) {
      ans = ans + Math.min(groups[i-1], groups[i]);
    }

    return ans;
  }

}
