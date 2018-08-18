package Repeated_String_Match_686;

/*
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it;
and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.
 */

public class Solution {
  public int repeatedStringMatch(String A, String B) {
    StringBuilder sb = new StringBuilder(A);
    int n = 1;
    while (sb.length() < B.length()) {
      sb.append(A);
      n++;
    }
    if (sb.indexOf(B) >= 0) return n;
    if (sb.append(A).indexOf(B) >= 0) return n+1;
    return -1;
  }
}