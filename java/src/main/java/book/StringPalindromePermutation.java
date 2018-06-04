package book;

import java.util.HashMap;
import java.util.HashSet;

public class StringPalindromePermutation {

  public boolean isPermutation(String s) {

    // Palindrome is a symmetrical string. Idea of the solution is to ensure that each char has even count (with the
    // exception of one char that can be in the middle of palindrome).

    // Using set to track iterated characters. Add if it's not contained in the set, remove otherwise.
    HashSet set = new HashSet();
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];

      if (set.contains(c)) {
        set.remove(c);
      } else {
        set.add(c);
      }
    }

    // In case of palindrome the set will be either empty (symmetrical) or have length == 1 (on char in the middle)
    return (set.size() <= 1);
  }
}
