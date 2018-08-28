package Restore_IP_Addresses_93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> ans = new ArrayList<>();
    List<String> list = new ArrayList<>();

    if (s == null || s.length() == 0) return ans;
    doDFS(s, 0, list, ans);
    return ans;
  }

  private void doDFS(String s, int p, List<String> list, List<String> ans) {

    if (list.size() == 4 && p == s.length()) {

      // If there are total of 4 groups - check that we'v reached end of string
      String res = String.join(".", list);
      ans.add(res);
    } else if (list.size() < 4) {

      // Try adding 1, 2 and 3 chars
      for (int i = 1; p + i <= s.length() && i <= 3; i++) {
        String sub = s.substring(p, p+i);
        if (isValid(sub)) {

          // Add substring, run recursively, then remove the substring
          list.add(sub);
          doDFS(s, p+i, list, ans);
          list.remove(list.size()-1);
        }
      }
    }
  }

  private boolean isValid(String s) {
    // Any string with single digit is valid
    if (s.length() == 1) {
      return true;
    }

    // Any string with > 3 digits is invalid
    if (s.length() > 3) {
      return false;
    }

    // String with non-single digits starting with zero is invalid
    if (s.charAt(0) == '0') {
      return false;
    }

    // Integer value should be <= 255
    return Integer.parseInt(s) <= 255;
  }
}
