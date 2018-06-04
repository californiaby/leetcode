package book;

public class StringProblem {

  /**
   * Check if all characters in the string are unique.
   * @param str String to check
   * @return true | false
   */
  public boolean isUnique(String str) {

    // We assume ASCII alphabet, which is limited to 128 symbols (no special symbols included)
    // Check null, empty string and longer than 128 symbols
    if (str == null || str.length() == 0 || str.length() > 128) {
      return false;
    }

    // Array is the fastest to modify / view so we use array to store characted already met in the string
    // From design perspective - identical to using a Map
    boolean[] charSet = new boolean[128];

    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);    // get integer code of char

      if (charSet[val]) {         // already found this char
        return false;
      }
      charSet[val] = true;        // store flag in charSet
    }

    return true;
  }

  /**
   * Check if one string is permutation of another.
   * @param s
   * @param t
   * @return
   */
  public boolean isPermutation(String s, String t) {

    // In order to be permutation, both strings need to have identical set of symbols.
    // I.e. equal length and equal count of each symbol.
    // Double check if upper-case need to be handled

    if (s == null || t == null || s.length() != t.length()) return false;

    // Use array as Map to store characters
    int[] letters = new int[128];

    // Iterate over String s and store each char and its count
    for (char c : s.toCharArray()) {
      letters[c]++;
    }

    // Iterate over String t and substract counter for each match
    for (char c : t.toCharArray()) {
      letters[c]--;
      if (letters[c] < 0) return false;
    }

    return true;
  }

}
