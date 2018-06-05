package rotated_digits_788;

public class Solution {

  public int rotatedDigits(int n) {
    int count = 0;

    for (int i = 0; i <= n; i++) {
      if (checkDigits(i)) {
        count++;
      }
    }

    return count;
  }

  /**
   * Check if number has at least one "rotatable" digit and none "incorrect" digits.
   * @param n
   * @return
   */
  private boolean checkDigits(int n) {
    boolean foundRotatable = false;
    while (n > 0) {
      int rem = n % 10;

      // Once rotatable digit was found - no need to chec these digits again
      if (!foundRotatable) {
        if (rem == 2 || rem == 5 || rem == 6 || rem == 9 ) {
          foundRotatable = true;
        }
      }

      // For each digit check that it's not one of incorrect digits
      if (rem == 3 || rem == 4 || rem == 7) {
        return false;
      }

      // Check next digit
      n = n / 10;
    }
    return foundRotatable;
  }

}
