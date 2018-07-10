package plus_one_66;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
 */

public class Solution {

  public int[] plusOne(int[] digits) {

    int n = digits.length;

    // iterate through the array from the end
    // if current number isn't 9 > inc it and return the array
    // otherwise, make it 0 and do the same for next number but with carryover
    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i]++;
        return digits;
      } else {
        digits[i] = 0;
      }
    }

    // if got to this point - all current digits are 0
    // so need to create a new arr and append 1 in the beginning

    int[] ans = new int[n + 1];
    ans[0] = 1;

    // all unmodified elements of the array will have value 0
    return ans;
  }

}
