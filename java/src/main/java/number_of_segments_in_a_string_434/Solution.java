package number_of_segments_in_a_string_434;

public class Solution {

  /*

  Count the number of segments in a string, where a segment is defined to be a
  contiguous sequence of non-space characters.
  Please note that the string does not contain any non-printable characters.

  Example:

  Input: "Hello, my name is John"
  Output: 5

   */

  public int countSegments(String s) {

    // Remove leading and trailing whitespaces
    String str = s.trim();
    if (str.equals("")) return 1;

    // Split str via regex with whitespaces
    String[] arr = str.split("\\s+");

    return arr.length;
  }

  // Solution #2
  // iterate through string
  // if(i==0 || (s.charAt(i)!=' ' && s.charAt(i-1)==' ')) { res++; }

}
