package detect_capital_520;

public class Solution {

  /*
  Alternative solution:
  - check that both 1st and last chars are uppercase. If they are - check that all chars between are uppercase
  - else check that all chars but 1st are lowercase
  - no need to check ALL - just return false once you see mismatch
   */

  public boolean detectCapitalUse(String word) {

    // Empty String or one symbol > true
    if (word.length() <= 1) { return true; }

    // Check first character
    if (Character.isLowerCase(word.charAt(0))) {

      // First char isn't capital, so all following should be not capital either
      return isFollowingPattern(word.substring(1), false);
    } else {

      // First chart is capital, so all following should be either capital or not
      return (isFollowingPattern(word.substring(1), false) || isFollowingPattern(word.substring(1), true));
    }

  }

  private boolean isFollowingPattern(String word, Boolean isUpperCase) {

    // Reached end of word
    if (word.length() == 0) {
      return true;
    }

    // First char doesn't follow the pattern
    if (Character.isUpperCase(word.charAt(0)) != isUpperCase) {
      return false;
    } else {
      return isFollowingPattern(word.substring(1), isUpperCase);
    }

  }

}
