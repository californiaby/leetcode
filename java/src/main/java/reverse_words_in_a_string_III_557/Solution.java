package reverse_words_in_a_string_III_557;

public class Solution {

  public String reverseWords(String s) {

    int start = 0;
    char[] st = s.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < st.length; i++) {
      if (st[i] == ' ') {
        sb.append(reverse(s.substring(start, i)));
      }
    }

    return sb.toString();
  }

  /**
   * Reverse string.
   * @param word
   * @return
   */
  private String reverse(String word) {
    int l = word.length();
    char[] chars = word.toCharArray();

    for (int i = 0; i < l / 2 - 1; i++) {
      char c = chars[i];
      chars[i] = chars[l - 1 - i];
      chars[l - 1 - i] = chars[i];
    }

    return chars.toString();
  }

}
