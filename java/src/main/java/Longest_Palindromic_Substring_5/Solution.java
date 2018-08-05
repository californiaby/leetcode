package Longest_Palindromic_Substring_5;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */

public class Solution {

  /*
  Solution: Expand Around Center => O(n^2)

   */

  public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";

    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {
      int len1 = expandAroundCenter(s, i, i);
      int len2 = expandAroundCenter(s, i, i + 1);
      int len = Math.max(len1, len2);

      if (len > end - start) {
        start = i - (len-1)/2;
        end = i + len/2;
      }
    }

    return s.substring(start, end + 1);
  }

  /**
   * Expands around center in given point (char of the string, or between chars).
   * Calculates length of palindromic string.
   * @param s     given string
   * @param left  left pointer
   * @param right right pointer
   * @return
   */
  private int expandAroundCenter(String s, int left, int right) {
    int start = left;
    int end = right;

    while (start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)) {
      start--;
      end++;
    }

    return end-start-1;
  }

}
