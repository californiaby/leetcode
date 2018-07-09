package power_of_two_231;

public class Solution {

  // power of two means that this number can be divided by two X times
  // and the result will be 2 ^ 1 == 2
  // edge case : 1 => 2 ^ 0
  // we don't need to check lg(2) as input is integer

  public boolean isPowerOfTwo(int n) {
    if (n == 0) return false;
    if (n == 1) return true;
    return (n % 2 == 0 && isPowerOfTwo(n / 2));
  }

}
