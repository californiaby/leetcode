package book;

public class StringOneWay {

  /**
   * Checks if s2 may be made of s1 with one edit (replacement, addition on removal of a single char)
   * @param s1 original string
   * @param s2 tested string
   * @return true || false
   */
  public boolean isOneWayEdit(String s1, String s2) {

    if (s1.length() == s2.length()) {
      return isOneReplacement(s1, s2);
    } else if (s1.length() + 1 == s2.length()) {
      return isOneInsertion(s1, s2);
    } else if (s1.length() - 1 == s2.length()) {
      return isOneInsertion(s2, s1);
    }

    // None of the above met, meaning that s1 and s2 length diff is > 1
    return false;
  }

  /**
   * Checks if string s2 may be generated from string s1 with one character replacement. Both Strings have same length.
   * @param s1
   * @param s2
   * @return
   */
  private boolean isOneReplacement(String s1, String s2) {
    boolean foundDiff = false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (foundDiff) { return false; }
        else { foundDiff = true; }
      }
    }

    // Not more than one diff was found so return true
    return true;
  }

  /**
   * Checks if string longer is just one symbol different from string shorter.
   * @param shorter
   * @param longer
   * @return
   */
  private boolean isOneInsertion(String shorter, String longer) {
    boolean foundDiff = false;

    int index1 = 0;
    int index2 = 0;

    while (index1 <  shorter.length() && index2 < longer.length()) {
      if (shorter.charAt(index1) != longer.charAt(index2)) {
        if (foundDiff) { return false; }
        else {
          foundDiff = true;
          index2++;
        }
      }
      index1++;
      index2++;
    }

    return true;
  }

}
