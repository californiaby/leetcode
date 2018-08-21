package Word_Break_139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  /**
   * DP solution. Run n*n iteration and for each substring check if there's a match in set.
   * Do this check only if current start position is marked as valid start.
   * @param s
   * @param wordDict
   * @return
   */
  public boolean wordBreak(String s, List<String> wordDict) {
    // We assume all words are lowercase
    if (s == null || wordDict == null) return false;

    // Use set for quick access to words
    HashSet<String> set = new HashSet<>(wordDict);

    // Use arr of booleans to store positions for which words end (i.e. the 1st symbol of next position
    boolean[] arr = new boolean[s.length() + 1];
    arr[0] = true;

    // Do n*n iteration to check every possible substring of the initial string. Mark locations where words end
    for (int i = 1; i <= s.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (arr[j] && set.contains(s.substring(j, i))) {
          arr[i] = true;
          break;
        }
      }
    }

    return arr[s.length()];
  }

  /**
   * Recursive solution with memoization.
   * Iterate from current position until set contains a match. Run recursively for matching position and keep iterating.
   * Use memoization to store already processed values and avoid rerunning.
   * @param s
   * @param wordDict
   * @return
   */
  private boolean wordBreakRecursive(String s, List<String> wordDict) {
    if (s == null || wordDict == null) return false;
    return wordBreak(s, new HashSet<String>(wordDict), 0, new Boolean[s.length()]);
  }

  private boolean wordBreak(String s, Set<String> set, int start, Boolean[] memo) {

    // End of string
    if (start == s.length()) return true;

    // Memoization - already processed position
    if (memo[start] != null) return memo[start];

    // Iteration
    for (int end = start + 1; end < s.length(); end++) {
      if (set.contains(s.substring(start, end)) && wordBreak(s, set, end, memo)) {
        return memo[start] = true;
      }
    }
    return memo[start] = false;
  }
}
