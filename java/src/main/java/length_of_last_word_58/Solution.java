package length_of_last_word_58;

public class Solution {

  /*
  Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
  return the length of last word in the string.
  If the last word does not exist, return 0.
  Note: A word is defined as a character sequence consists of non-space characters only
   */

  public int lengthOfLastWord(String s) {

    String[] arr = s.split("\\s+");

    if (arr.length < 1) {
      return 0;
    } else {
      return arr[arr.length - 1].length();
    }

  }

}
