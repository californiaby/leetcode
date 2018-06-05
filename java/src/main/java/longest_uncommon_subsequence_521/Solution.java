package longest_uncommon_subsequence_521;

/* Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence
should not be any subsequence of the other strings.
 */

public class Solution {

  public int findLUSlength (String a, String b) {

    // If strings are equal - there's no uncommon subsequence
    if (a.equals(b)) { return -1; }

    // If strings have same length and not equal - any is the longest uncommon subsequence
    if (a.length() == b.length() && !a.equals(b)) { return a.length(); }

    // If lengths aren't equal - return the longest length
    return Math.max(a.length(), b.length());
  }

}
