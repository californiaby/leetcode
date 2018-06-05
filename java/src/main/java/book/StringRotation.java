package book;

public class StringRotation {

  public boolean isRotation(String s1, String s2) {

    if (s1.length() != s2.length()) { return false; }

    String s1s1 = s1 + s1;
    return isSubString(s2, s1s1);
  }

  /**
   * Checks if string is a substring of another string
   * @param s String to check (shorter)
   * @param l String that may contain another string (longer)
   * @return true || false
   */
  private boolean isSubString(String s, String l) {
    // Check if string {l} is longer than string {s}
    if (l.length() < s.length()) { return false; }
    int j = 0;

    // iterate over string and check char by char (cycle limited to short string's length)
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(j) == l.charAt(i)) {
        j++;
      } else {
        // Char doesn't match, so iterated part of longer string isn't matching
        // Run recursively for the remaining part
        return isSubString(s, l.substring(i + 1));
      }
    }

    // True if pointer is matching string's last char
    return (j == s.length());

  }

}
