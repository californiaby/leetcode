package reverse_string_ii_541;

import javax.print.DocFlavor;

public class Solution {

  /*
  Given a string and an integer k, you need to reverse the first k characters for every 2k characters
  counting from the start of the string. If there are less than k characters left, reverse all of them.
  If there are less than 2k but greater than or equal to k characters, then reverse the first k characters
  and left the other as original.

  Input: s = "abcdefg", k = 2
  Output: "bacdfeg"
   */

  public String reverseStr(String s, int k) {

    StringBuilder sb = new StringBuilder();
    int n = 0;
    int l = s.length();
    int st = n * k;
    int end;

    // Iterate while start pointer is withing string length
    while (st < l) {

      // Get end pointer - min between st + k and length
      end = Math.min(st + k, l);
      String sub = s.substring(st, end);

      // n is even => reverse
      if (n % 2 == 0) {
        sub = reverse(sub);
      };

      // Append substring
      sb.append(sub);

      // Update start pointer
      st = st + k;
      n++;
    }

    return sb.toString();
  }

  private String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

}
