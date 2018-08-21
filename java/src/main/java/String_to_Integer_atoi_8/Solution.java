package String_to_Integer_atoi_8;

public class Solution {
  public int myAtoi(String str) {

    int ans = 0;
    if (str == null || str.length() == 0) return ans;

    int p = 0;
    int n = str.length() - 1;
    int sign = 0;

    // discard whitespaces in the beginning of string
    while (p <= n && str.charAt(p) == ' ') p++;

    // define +/- sign
    while (p <= n && (str.charAt(p) == '+' || str.charAt(p) == '-')) {
      if (str.charAt(p) == '+') {
        sign = 1;
      } else {
        sign = -1;
      }
      p++;
    }

    // iterate through numbers
    while (p <= n) {
      int digit = str.charAt(p) - '0';
      if (digit < 0 || digit > 9) break;

      // check if ans will be overflow in case if digit is appended
      if (Integer.MAX_VALUE / 10 < ans || Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10 < digit) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }

      ans = ans * 10 + digit;
      p++;
    }

    return ans * sign;
  }
}
